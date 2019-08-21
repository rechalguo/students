package rechal.apps.coll.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.blc.utils.excel.parser.ExcelParsable;
import com.blc.utils.excel.parser.ExcelStreamParser;

import rechal.apps.coll.App;
import rechal.apps.coll.entity.CClass;
import rechal.apps.coll.entity.CCourse;
import rechal.apps.coll.entity.CMarkedExt;
import rechal.apps.coll.mapper.ext.CClassMapperExt;
import rechal.apps.coll.mapper.ext.CCourseMapperExt;
import rechal.apps.coll.model.MarkedModel;
import rechal.apps.coll.model.Score;
import rechal.apps.coll.model.ScoreModel;
import rechal.apps.coll.service.CollegeService;
import rechal.apps.coll.service.StaService;
import rechal.apps.coll.util.DateTimeUtil;

@RequestMapping("/sta")
@Controller
public class StaController {

	@Autowired
	private StaService staService;
	@Autowired
	private CollegeService collService;
	@Autowired
	private CCourseMapperExt courseMapper;
	@Autowired
	private CClassMapperExt clazzMapper;

	@PostMapping("/online")
	private ModelAndView onlinePage() {
		ModelAndView v = new ModelAndView("sta/online");
		List<Map<String, String>> columns = this.staService.getColumns("");
		v.addObject("colCourses", columns);
		return v;
	}

	@PostMapping("/result")
	private ModelAndView resultPage() {
		ModelAndView v = new ModelAndView("sta/result");

		int mc = this.staService.maxClassNumber();
		List<Map<String, String>> clazz = new ArrayList<>(mc);
		for (int i = 0; i < mc; i++) {
			Map<String, String> t = new HashMap<>(2);
			t.put("C_NO", "C_" + Integer.toString(i + 1));
			t.put("C_NAME", Integer.toString(i + 1) + "班");
			clazz.add(t);
		}
		v.addObject("clazz", clazz);
		return v;
	}

	@RequestMapping("/template")
	public void uploadTemplate(HttpServletResponse response){
		
		ApplicationHome home=new ApplicationHome(App.class);
	 	response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");// 设置强制下载不打开            
	 	response.addHeader("Content-Disposition", "attachment;fileName=template.xlsx");
	 	byte[] buffer = new byte[1024];
	 	FileInputStream fis = null;
	 	BufferedInputStream bis = null;
	 	try {
	 		URL url=new URL("jar:file:/"+home.getSource().getAbsolutePath().concat("!/BOOT-INF/classes/templates/files/templates/template.xlsx"));
	 		bis = new BufferedInputStream(url.openStream());
	 		OutputStream outputStream = response.getOutputStream();
	 		int i = bis.read(buffer);
	 		while (i != -1) {
	 			outputStream.write(buffer, 0, i);
	 			i = bis.read(buffer);
	 		}
	 	} catch (Exception e) {
	 		e.printStackTrace();
	 	} finally {
	 		if (bis != null) {
		 		try {
		 			bis.close();
		 		} catch (IOException e) {
		 			e.printStackTrace();
		  		}
	 		}
		 	if (fis != null) {
		 		try {
		 			fis.close();
		 		} catch (IOException e) {
		 			e.printStackTrace();
		 		}
		 	}
	 	}
		
//		 String fileName = userdir.concat(File.separator).concat("config").concat(File.separator).concat("template.xlsx");//被下载文件的名称
//		 File file = new File(fileName);
//		 if (file.exists()) {
//		 	response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");// 设置强制下载不打开            
//		 	response.addHeader("Content-Disposition", "attachment;fileName=template.xlsx");
//		 	byte[] buffer = new byte[1024];
//		 	FileInputStream fis = null;
//		 	BufferedInputStream bis = null;
//		 	try {
//		 		URL url=new URL("jar:file:/"+home.getSource().getAbsolutePath().concat("!/BOOT-INF/classes/templates/files/templates/template.xlsx"));
//		 		fis = new FileInputStream(file);
//		 		bis = new BufferedInputStream(fis);
//		 		OutputStream outputStream = response.getOutputStream();
//		 		int i = bis.read(buffer);
//		 		while (i != -1) {
//		 			outputStream.write(buffer, 0, i);
//		 			i = bis.read(buffer);
//		 		}
//		 	} catch (Exception e) {
//		 		e.printStackTrace();
//		 	} finally {
//		 		if (bis != null) {
//			 		try {
//			 			bis.close();
//			 		} catch (IOException e) {
//			 			e.printStackTrace();
//			  		}
//		 		}
//			 	if (fis != null) {
//			 		try {
//			 			fis.close();
//			 		} catch (IOException e) {
//			 			e.printStackTrace();
//			 		}
//			 	}
//		 	}
//		 }
	}

	/**
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping("/upload/score")
	@ResponseBody
	public Object uploadScore(HttpServletRequest request) {
		Map<String, String> result = new HashMap<>(3);
		MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> uploadfiles = req.getFileMap();

		String termNo = req.getParameter("termNo");
		String reset = req.getParameter("reset");
		MultipartFile f = uploadfiles.get("file");

		List<String> course = new ArrayList<>(); // 学科字段
		List<Score> scores = new ArrayList<>();
		ExcelParsable<HashMap> ep = null;
		try {
			int v = version(f.getOriginalFilename());
			if (v == -1) {
				result.put("code", "1");
				result.put("msg", "未知的EXCEL版本,请使用xlsx 或xls版本的EXCEL");
				return result;
			}

			// 解析
			ep = new ExcelStreamParser<HashMap>(HashMap.class, f.getInputStream(), version(f.getOriginalFilename()));
			List<HashMap> s = ep.parsingToList(1, true, null, null);
			if (s == null || s.isEmpty()) {
				result.put("code", "1");
				result.put("msg", "未解析到数据");
				return result;
			}

			Map<String, CCourse> courses = courseMapper.cacheCourseKeyName(); // 学科名字与字段对应表
			Map<String, CClass> clazzes = clazzMapper.cacheClassKeyName(); // 班级与字段对应表
			List<String> courseBad = new ArrayList<>(); // 没有配置的学科字段 需要先设置学科
			final List<String> clazzBad = new ArrayList<>(); // 没有配置的班级 需要先设置班级

			// 解析学科
			HashMap r0 = s.get(0);
			for (Object k : r0.keySet()) {
				if ("班级".equals(k.toString().trim())) {
				} else if ("姓名".equals(k.toString().trim())) {
				} else if ("考号".equals(k.toString().trim())) {
				} else {
					if (!courses.containsKey(k.toString().trim())) {
						courseBad.add(k.toString().trim());
					} else {
						course.add(k.toString().trim());
					}
				}
			}
			if (!courseBad.isEmpty()) {
				result.put("code", "1");
				result.put("msg", "未识别的学科" + courseBad + "，请先在系统添加\"学科信息\"");
				return result;
			}
			courseBad.clear();
			courseBad = null;
			if (course == null || course.isEmpty()) {
				result.put("code", "1");
				result.put("msg", "文件中未发现学科列，如语文");
				return result;
			}

			// 转换成对象
			s.stream().forEach(r -> {
				Score c = new Score();
				for (Object e : r.entrySet()) {
					Entry<Object, Object> et = (Entry<Object, Object>) e;
					String t = et.getKey().toString();
					if ("班级".equals(t.trim())) {
						if (!clazzes.containsKey(et.getValue().toString().trim())) {
							clazzBad.add(et.getValue().toString().trim());
						} else {
							c.setcId(clazzes.get(et.getValue().toString().trim()).getcId());
						}
					} else if ("姓名".equals(t.trim())) {
						c.setsName(et.getValue().toString().trim());
					} else if ("考号".equals(t.trim())) {
						c.setsNo(et.getValue().toString());
					}
				}
				StringBuilder cscores = new StringBuilder();
				Object val = null;
				for (String cstr : course) {
					val = r.get(cstr);
					if (val == null || "".equals(val.toString()))
						val = "0.0";
					cscores = cscores.append(",").append(val.toString());
				}
				c.setScores(cscores.toString());
				c.setmNo(termNo);
				c.setmDate(DateTimeUtil.getCurrentDate());
				scores.add(c);
			});
			if (!clazzBad.isEmpty()) {
				result.put("code", "1");
				result.put("msg", "未识别的班级" + clazzBad + "，请先在系统添加\"班级信息\"");
				return result;
			}
			clazzBad.clear();
		} catch (Exception e1) {
			e1.printStackTrace();
			result.put("code", "1");
			result.put("msg", "文件解析失败");
			return result;
		}

		// 保存数据
		try {
			result = staService.importedScores(termNo, course, scores, Boolean.valueOf(reset));
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "1");
			result.put("msg", "上传失败，系统异常");
		}
		return result;
	}

	/**
	 * ============================= score ===========================
	 */
	@PostMapping("/score/list")
	@ResponseBody
	public Object scoreList(ScoreModel model) {
		Map<String, Object> dataObject = new HashMap<>();
		dataObject.put("code", "0");
		dataObject.put("msg", "success");
		dataObject.put("data", this.staService.scoreList(model));
		return dataObject;
	}

	@PostMapping("/marked/list")
	@ResponseBody
	public Object markedList(MarkedModel model) {
		if (model.isCreate()) {
			return this.markedCreate(model);
		}
		Map<String, Object> dataObject = new HashMap<>();
		dataObject.put("code", "0");
		dataObject.put("msg", "success");
		dataObject.put("data", this.staService.markedList(model));
		return dataObject;
	}

	@PostMapping("/marked/create")
	@ResponseBody
	public Object markedCreate(MarkedModel model) {
		Map<String, Object> dataObject = new HashMap<>();
		try {
			dataObject.put("code", "0");
			dataObject.put("data", this.staService.markedCreate(model));
			dataObject.put("msg", "success");
		} catch (Exception e) {
			model.setTotalRows(0);
			dataObject.put("code", "1");
			dataObject.put("msg", e.getMessage());
			dataObject.put("data", model);
			e.printStackTrace();
		}
		return dataObject;
	}

	@PostMapping("/marked/save")
	@ResponseBody
	public Object markedSave(CMarkedExt model) {
		Map<String, Object> dataObject = new HashMap<>();
		try {
			dataObject.put("code", "0");
			dataObject.put("data", this.staService.markedSave(model));
			dataObject.put("msg", "修改成功");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", e.getMessage());
			e.printStackTrace();
		}
		return dataObject;
	}

	/**
	 * 统计班级上线人数
	 */
	@PostMapping("/result/clist")
	@ResponseBody
	public Object markListByClass(MarkedModel model) {
		Map<String, Object> dataObject = new HashMap<>();
		try {
			dataObject.put("code", "0");
			dataObject.put("data", this.staService.markedListByClass(model));
			dataObject.put("msg", "修改成功");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", e.getMessage());
			e.printStackTrace();
		}
		return dataObject;
	}

	private int version(String filename) {
		if (filename.endsWith(".xlsx"))
			return ExcelParsable.EXCEL_VER_2007;
		else if (filename.endsWith(".xls"))
			return ExcelParsable.EXCEL_VER_2003;
		return -1;
	}
}

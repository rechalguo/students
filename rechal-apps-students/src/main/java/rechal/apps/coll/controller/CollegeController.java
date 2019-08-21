package rechal.apps.coll.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import rechal.apps.coll.entity.CClass;
import rechal.apps.coll.entity.CCourse;
import rechal.apps.coll.entity.CStu;
import rechal.apps.coll.model.ClazzModel;
import rechal.apps.coll.model.CourseModel;
import rechal.apps.coll.model.StuModel;
import rechal.apps.coll.service.CollegeService;

@RequestMapping("/coll")
@Controller
public class CollegeController {

	@Autowired
	private CollegeService collegeService;
	
	
	@PostMapping("/course")
	public String gradePage(){
		return "coll/course";
	}
	@PostMapping("/clazz")
	public String clazzPage(){
		return "coll/clazz";
	}
	@PostMapping("/stu")
	public String studentPage(){
		return "coll/stu";
	}
	
	/**
	 * ============================= clazz ===========================
	 */
	@PostMapping("/clazz/list")
	@ResponseBody
	public Object clazzList(ClazzModel model) {
		Map<String, Object> dataObject =new HashMap<>();
		dataObject.put("code", "0");
		dataObject.put("msg", "success");
		dataObject.put("data", this.collegeService.listClazzes(model));
		return dataObject;
	}
	@PostMapping("/clazz/save")
	@ResponseBody
	public Object clazzSave(CClass grade) {
		Map<String, Object> dataObject =new HashMap<>();
		try {
			this.collegeService.updateClazz(grade);
			dataObject.put("code", "0");
			dataObject.put("msg", "班级信息修改成功!");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", "班级信息修改失败!");
			e.printStackTrace();
		}
		return dataObject;
	}
	@PostMapping("/clazz/add")
	@ResponseBody
	public Object clazzAdd(CClass grade) {
		Map<String, Object> dataObject =new HashMap<>();
		try {
			this.collegeService.addClazz(grade);
			dataObject.put("code", "0");
			dataObject.put("msg", "班级信息添加成功!");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", "班级信息添加失败!");
			e.printStackTrace();
		}
		return dataObject;
	}
	
	/**
	 * ============================= course 学科 ===========================
	 */
	@PostMapping("/course/list")
	@ResponseBody
	public Object courseList(CourseModel model) {
		Map<String, Object> dataObject =new HashMap<>();
		dataObject.put("code", "0");
		dataObject.put("msg", "success");
		dataObject.put("data", this.collegeService.listCourses(model));
		return dataObject;
	}
	@PostMapping("/course/save")
	@ResponseBody
	public Object courseSave(CCourse grade) {
		Map<String, Object> dataObject =new HashMap<>();
		try {
			this.collegeService.updateCourse(grade);
			dataObject.put("code", "0");
			dataObject.put("msg", "学科信息修改成功!");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", "学科信息修改失败!");
			e.printStackTrace();
		}
		return dataObject;
	}
	@PostMapping("/course/add")
	@ResponseBody
	public Object courseAdd(CCourse grade) {
		Map<String, Object> dataObject =new HashMap<>();
		try {
			this.collegeService.addCourse(grade);
			dataObject.put("code", "0");
			dataObject.put("msg", "学科信息添加成功!");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", "学科信息添加失败!");
			e.printStackTrace();
		}
		return dataObject;
	}
	
	

	/**
	 * ============================= 学生 ===========================
	 */
	@PostMapping("/stu/list")
	@ResponseBody
	public Object stuList(StuModel model) {
		Map<String, Object> dataObject =new HashMap<>();
		dataObject.put("code", "0");
		dataObject.put("msg", "success");
		dataObject.put("data", this.collegeService.listStus(model));
		return dataObject;
	}
	@PostMapping("/stu/save")
	@ResponseBody
	public Object stuSave(CStu grade) {
		Map<String, Object> dataObject =new HashMap<>();
		try {
			this.collegeService.updateStu(grade);
			dataObject.put("code", "0");
			dataObject.put("msg", "学生信息修改成功!");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", "学生信息修改失败!");
			e.printStackTrace();
		}
		return dataObject;
	}
	@PostMapping("/stu/add")
	@ResponseBody
	public Object stuAdd(CStu grade) {
		Map<String, Object> dataObject =new HashMap<>();
		try {
			this.collegeService.addStu(grade);
			dataObject.put("code", "0");
			dataObject.put("msg", "学生信息添加成功!");
		} catch (Exception e) {
			dataObject.put("code", "1");
			dataObject.put("msg", "学生信息添加失败!");
			e.printStackTrace();
		}
		return dataObject;
	}
}

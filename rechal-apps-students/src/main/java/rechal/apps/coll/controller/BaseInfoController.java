package rechal.apps.coll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import rechal.apps.coll.model.BaseInfoModel;
import rechal.apps.coll.model.ClazzModel;
import rechal.apps.coll.model.CourseModel;
import rechal.apps.coll.service.BaseInfoService;

@RequestMapping("/base")
@Controller
public class BaseInfoController {

	@Autowired
	private BaseInfoService baseInfoService;
	
	@GetMapping("/clazz")
	@ResponseBody
	public ClazzModel getClazz(ClazzModel model){
		return this.baseInfoService.queryClasses(model);
	}
	
	@GetMapping("/termed")
	@ResponseBody
	public BaseInfoModel termedList(BaseInfoModel model) {
		return this.baseInfoService.queryBaseInfoByType(model, BaseInfoService.BASE_TERMED);
	}
	
	@GetMapping("/exists/clazz")
	@ResponseBody
	public String existsClazz(ClazzModel model) {
		if(this.baseInfoService.existsClazz(model)){
			return "true";
		}
		return "false";
	}
	@GetMapping("/exists/course")
	@ResponseBody
	public String existsCourse(CourseModel model) {
		if(this.baseInfoService.existsCourse(model)){
			return "true";
		}
		return "false";
	}
}

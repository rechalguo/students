package rechal.apps.coll.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rechal.apps.coll.entity.CClass;
import rechal.apps.coll.entity.CClassExample;
import rechal.apps.coll.entity.CCourse;
import rechal.apps.coll.entity.CCourseExample;
import rechal.apps.coll.mapper.ext.BaseInfoMapper;
import rechal.apps.coll.mapper.ext.CClassMapperExt;
import rechal.apps.coll.mapper.ext.CCourseMapperExt;
import rechal.apps.coll.model.BaseInfoModel;
import rechal.apps.coll.model.ClazzModel;
import rechal.apps.coll.model.CourseModel;

@Service
public class BaseInfoService {

	@Autowired
	private BaseInfoMapper baseMapper;
	@Autowired
	private CClassMapperExt clazzMapper;
	@Autowired
	private CCourseMapperExt courseMapper;
	
	
	
	public static final String BASE_GRADE="1";
	public static final String BASE_TERMED="2";
	
	public BaseInfoModel queryBaseInfoByType(BaseInfoModel p, String baseInfoType){
		if(p.getP()!=null) p.setP(p.getP().trim());
		List<Map<String,Object>> rs= null;
		if(BASE_TERMED.equals(baseInfoType)) {
			rs=this.baseMapper.selectTermedbyPage(p);
		}
		if(rs==null) return p;
		
		List<Map<String,Object>> result=new ArrayList<>(rs.size());
		for(Map<String,Object> r:rs){
			Map<String,Object> option=new HashMap<String,Object>();
			for(Object k:r.keySet()) {
				option.put(k.toString().toLowerCase(), r.get(k));
			}
			result.add(option);
		}
		
		p.getRows().addAll(result);
		return p;
	}
	
	public ClazzModel queryClasses(ClazzModel p){
		List<CClass> rs= this.clazzMapper.selectByPage(p);
		List<Map<String,Object>> result=new ArrayList<>(rs.size());
		for(CClass r:rs){
			Map<String,Object> option=new HashMap<String,Object>();
			option.put("id", r.getcId());
			option.put("text", r.getcName().concat("(").concat(r.getcNo()).concat(")"));
			result.add(option);
		}
		p.getRows().addAll(result);
		return p;
	}
	
	
	public boolean existsClazz(ClazzModel model) {
		CClassExample e=new CClassExample();
		e.createCriteria().andCNoEqualTo(model.getClazz().getcNo());
		List<CClass> classes=this.clazzMapper.selectByExample(e);
		if(classes==null||classes.isEmpty()) return false;
		return true;
	}
	public boolean existsCourse(CourseModel model) {
		CCourseExample e=new CCourseExample();
		e.createCriteria().andKNoEqualTo(model.getCourse().getkNo());
		List<CCourse> course=this.courseMapper.selectByExample(e);
		if(course==null||course.isEmpty()) return false;
		return true;
	}
}

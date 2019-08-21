package rechal.apps.coll.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rechal.apps.coll.entity.CClass;
import rechal.apps.coll.entity.CCourse;
import rechal.apps.coll.entity.CStu;
import rechal.apps.coll.mapper.ext.CClassMapperExt;
import rechal.apps.coll.mapper.ext.CCourseMapperExt;
import rechal.apps.coll.mapper.ext.CStuMapperExt;
import rechal.apps.coll.model.ClazzModel;
import rechal.apps.coll.model.CourseModel;
import rechal.apps.coll.model.StuModel;

@Service
public class CollegeService {

	@Autowired
	private CClassMapperExt clazzMapper;
	@Autowired
	private CCourseMapperExt courseMapper;
	@Autowired
	private CStuMapperExt studentMapper;
	
	
	
	public ClazzModel listClazzes(ClazzModel model) {
		List<CClass> grades=this.clazzMapper.selectByPage(model);
		model.getRows().addAll(grades);
		return model;
	}
	public int updateClazz(CClass grade) {
		return this.clazzMapper.updateByPrimaryKeySelective(grade);
	}
	public int addClazz(CClass grade) {
		return this.clazzMapper.insert(grade);
	}
	
	
	public CourseModel listCourses(CourseModel model) {
		List<CCourse> grades=this.courseMapper.selectByPage(model);
		model.getRows().addAll(grades);
		return model;
	}
	public int updateCourse(CCourse grade) {
		return this.courseMapper.updateByPrimaryKeySelective(grade);
	}
	public int addCourse(CCourse grade) {
		this.courseMapper.addMarkCourse(grade);
		return this.courseMapper.insertCourse(grade);
	}
	
	public StuModel listStus(StuModel model) {
		List<CStu> grades=this.studentMapper.selectByPage(model);
		model.getRows().addAll(grades);
		return model;
	}
	public int updateStu(CStu grade) {
		if(grade.getsBirthDate()!=null){
			Calendar c=Calendar.getInstance();
			c.setTime(grade.getsBirthDate());
			LocalDate today = LocalDate.now();
		    LocalDate oldDate = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		    Period p = Period.between(oldDate, today);
		    grade.setsAge((byte) p.getYears());
		}
		return this.studentMapper.updateByPrimaryKeySelective(grade);
	}
	public int addStu(CStu grade) {
		if(grade.getsBirthDate()!=null){
			Calendar c=Calendar.getInstance();
			c.setTime(grade.getsBirthDate());
			LocalDate today = LocalDate.now();
		    LocalDate oldDate = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		    Period p = Period.between(oldDate, today);
		    grade.setsAge((byte) p.getYears());
		}
		return this.studentMapper.insert(grade);
	}
}

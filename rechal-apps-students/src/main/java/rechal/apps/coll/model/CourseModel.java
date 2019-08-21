package rechal.apps.coll.model;

import org.grc.common.mybatis.page.PageParameter;

import rechal.apps.coll.entity.CCourse;

public class CourseModel extends PageParameter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7970438505492874912L;

	private CCourse course=new CCourse();

	public CCourse getCourse() {
		return course;
	}

	public void setCourse(CCourse course) {
		this.course = course;
	}
	
}

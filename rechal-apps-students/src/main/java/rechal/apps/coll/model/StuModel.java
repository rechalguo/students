package rechal.apps.coll.model;

import org.grc.common.mybatis.page.PageParameter;

import rechal.apps.coll.entity.CStu;

public class StuModel extends PageParameter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2547357796585417982L;

	private CStu stu=new CStu();

	public CStu getStu() {
		return stu;
	}

	public void setStu(CStu stu) {
		this.stu = stu;
	}
	
}

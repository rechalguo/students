package rechal.apps.coll.model;

import org.grc.common.mybatis.page.PageParameter;

import rechal.apps.coll.entity.CClass;

public class ClazzModel extends PageParameter{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7456354513150769340L;
	private CClass clazz=new CClass();

	public CClass getClazz() {
		return clazz;
	}

	public void setClazz(CClass clazz) {
		this.clazz = clazz;
	}
}

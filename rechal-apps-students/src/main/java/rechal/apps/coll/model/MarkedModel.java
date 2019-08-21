package rechal.apps.coll.model;

import org.grc.common.mybatis.page.PageParameter;

import rechal.apps.coll.entity.CMarked;

public class MarkedModel extends PageParameter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8657581676952634656L;
	CMarked marked=new CMarked();
	private String coll;
	private String course;
	private Double collLine;   //总分分数线
	private Double courseLine; //单科分数线
	private boolean create=false;
	public CMarked getMarked() {
		return marked;
	}
	public void setMarked(CMarked marked) {
		this.marked = marked;
	}
	public String getColl() {
		return coll;
	}
	public void setColl(String coll) {
		this.coll = coll;
	}
	public boolean isCreate() {
		return create;
	}
	public void setCreate(boolean create) {
		this.create = create;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getCollLine() {
		return collLine;
	}
	public void setCollLine(Double collLine) {
		this.collLine = collLine;
	}
	public Double getCourseLine() {
		return courseLine;
	}
	public void setCourseLine(Double courseLine) {
		this.courseLine = courseLine;
	}
	
}

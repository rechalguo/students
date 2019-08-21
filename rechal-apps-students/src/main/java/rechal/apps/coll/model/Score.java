package rechal.apps.coll.model;

import java.util.Date;

import rechal.apps.coll.entity.CMark;

public class Score extends CMark {
    private String mNo;
    private Long cId;
    private Date mDate;
    private String sName;
    private String mNote;
    
    private String scores;
	public String getmNo() {
		return mNo;
	}
	public void setmNo(String mNo) {
		this.mNo = mNo;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getmNote() {
		return mNote;
	}
	public void setmNote(String mNote) {
		this.mNote = mNote;
	}
	public String getScores() {
		return scores;
	}
	public void setScores(String scores) {
		this.scores = scores;
	}
}
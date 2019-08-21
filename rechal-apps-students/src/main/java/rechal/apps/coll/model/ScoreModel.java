package rechal.apps.coll.model;

import org.grc.common.mybatis.page.PageParameter;

public class ScoreModel extends PageParameter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7053022552158326322L;
	Score score=new Score();
	private String coll; // 总分的列

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public String getColl() {
		return coll;
	}

	public void setColl(String coll) {
		this.coll = coll;
	}
	
}

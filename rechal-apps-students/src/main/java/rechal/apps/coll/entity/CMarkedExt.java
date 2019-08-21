package rechal.apps.coll.entity;

public class CMarkedExt extends CMarked {

	private String kName;

	public String getkName() {
		return kName;
	}

	public void setkName(String kName) {
		this.kName = kName;
	}
	public String toString(){
		return this.getkNo()+", "+this.kName+", "+this.getMsMarked();
	}
}

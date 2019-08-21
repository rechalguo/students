package rechal.apps.coll.entity;

public class CTermed {
    private Long tId;

    private String mNo;

    private String tStat;

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo == null ? null : mNo.trim();
    }

    public String gettStat() {
        return tStat;
    }

    public void settStat(String tStat) {
        this.tStat = tStat == null ? null : tStat.trim();
    }
}
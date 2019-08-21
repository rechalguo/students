package rechal.apps.coll.entity;

import java.util.Date;

public class CMarked {
    private Long msId;

    private Date msCreateDate;

    private String mNo;

    private String kNo;

    private Double msWeight;

    private Double msRate;

    private Double msLine;

    private Integer msAll;

    private Integer msMarked;

    private String msNote;

    public Long getMsId() {
        return msId;
    }

    public void setMsId(Long msId) {
        this.msId = msId;
    }

    public Date getMsCreateDate() {
        return msCreateDate;
    }

    public void setMsCreateDate(Date msCreateDate) {
        this.msCreateDate = msCreateDate;
    }

    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo == null ? null : mNo.trim();
    }

    public String getkNo() {
        return kNo;
    }

    public void setkNo(String kNo) {
        this.kNo = kNo == null ? null : kNo.trim();
    }

    public Double getMsWeight() {
        return msWeight;
    }

    public void setMsWeight(Double msWeight) {
        this.msWeight = msWeight;
    }

    public Double getMsRate() {
        return msRate;
    }

    public void setMsRate(Double msRate) {
        this.msRate = msRate;
    }

    public Double getMsLine() {
        return msLine;
    }

    public void setMsLine(Double msLine) {
        this.msLine = msLine;
    }

    public Integer getMsAll() {
        return msAll;
    }

    public void setMsAll(Integer msAll) {
        this.msAll = msAll;
    }

    public Integer getMsMarked() {
        return msMarked;
    }

    public void setMsMarked(Integer msMarked) {
        this.msMarked = msMarked;
    }

    public String getMsNote() {
        return msNote;
    }

    public void setMsNote(String msNote) {
        this.msNote = msNote == null ? null : msNote.trim();
    }
}
package rechal.apps.coll.entity;

import java.util.Date;

public class CCourse {
    private Long kId;

    private String kNo;

    private String kName;

    private Date kCreateDate;

    private String kNote;

    public Long getkId() {
        return kId;
    }

    public void setkId(Long kId) {
        this.kId = kId;
    }

    public String getkNo() {
        return kNo;
    }

    public void setkNo(String kNo) {
        this.kNo = kNo == null ? null : kNo.trim();
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName == null ? null : kName.trim();
    }

    public Date getkCreateDate() {
        return kCreateDate;
    }

    public void setkCreateDate(Date kCreateDate) {
        this.kCreateDate = kCreateDate;
    }

    public String getkNote() {
        return kNote;
    }

    public void setkNote(String kNote) {
        this.kNote = kNote == null ? null : kNote.trim();
    }
}
package rechal.apps.coll.entity;

import java.util.Date;

public class CTerm {
    private Long tId;

    private String tName;

    private String tYear;

    private Date tStart;

    private Date tEnd;

    private Date tCreateDate;

    private String tNote;

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettYear() {
        return tYear;
    }

    public void settYear(String tYear) {
        this.tYear = tYear == null ? null : tYear.trim();
    }

    public Date gettStart() {
        return tStart;
    }

    public void settStart(Date tStart) {
        this.tStart = tStart;
    }

    public Date gettEnd() {
        return tEnd;
    }

    public void settEnd(Date tEnd) {
        this.tEnd = tEnd;
    }

    public Date gettCreateDate() {
        return tCreateDate;
    }

    public void settCreateDate(Date tCreateDate) {
        this.tCreateDate = tCreateDate;
    }

    public String gettNote() {
        return tNote;
    }

    public void settNote(String tNote) {
        this.tNote = tNote == null ? null : tNote.trim();
    }
}
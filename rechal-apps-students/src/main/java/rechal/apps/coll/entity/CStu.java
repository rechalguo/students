package rechal.apps.coll.entity;

import java.util.Date;

public class CStu {
    private String sNo;

    private String sName;

    private Byte sAge;

    private String sSex;

    private Date sBirthDate;

    private Date sIntakeDate;

    private Date sOuttakeDate;

    private String sTel;

    private String sAddr;

    private Date sCreateDate;

    private String sNote;

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo == null ? null : sNo.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Byte getsAge() {
        return sAge;
    }

    public void setsAge(Byte sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    public Date getsBirthDate() {
        return sBirthDate;
    }

    public void setsBirthDate(Date sBirthDate) {
        this.sBirthDate = sBirthDate;
    }

    public Date getsIntakeDate() {
        return sIntakeDate;
    }

    public void setsIntakeDate(Date sIntakeDate) {
        this.sIntakeDate = sIntakeDate;
    }

    public Date getsOuttakeDate() {
        return sOuttakeDate;
    }

    public void setsOuttakeDate(Date sOuttakeDate) {
        this.sOuttakeDate = sOuttakeDate;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel == null ? null : sTel.trim();
    }

    public String getsAddr() {
        return sAddr;
    }

    public void setsAddr(String sAddr) {
        this.sAddr = sAddr == null ? null : sAddr.trim();
    }

    public Date getsCreateDate() {
        return sCreateDate;
    }

    public void setsCreateDate(Date sCreateDate) {
        this.sCreateDate = sCreateDate;
    }

    public String getsNote() {
        return sNote;
    }

    public void setsNote(String sNote) {
        this.sNote = sNote == null ? null : sNote.trim();
    }
}
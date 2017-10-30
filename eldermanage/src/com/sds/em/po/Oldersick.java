package com.sds.em.po;

import java.util.Date;

public class Oldersick {
    private Integer sickid;

    private Integer sickolderid;

    private String sickinfo;

    private String sickdoctor;

    private Date sickdate;

    private String sickadvice;

    private String sickhospital;

    private String sicktype;

    public Integer getSickid() {
        return sickid;
    }

    public void setSickid(Integer sickid) {
        this.sickid = sickid;
    }

    public Integer getSickolderid() {
        return sickolderid;
    }

    public void setSickolderid(Integer sickolderid) {
        this.sickolderid = sickolderid;
    }

    public String getSickinfo() {
        return sickinfo;
    }

    public void setSickinfo(String sickinfo) {
        this.sickinfo = sickinfo == null ? null : sickinfo.trim();
    }

    public String getSickdoctor() {
        return sickdoctor;
    }

    public void setSickdoctor(String sickdoctor) {
        this.sickdoctor = sickdoctor == null ? null : sickdoctor.trim();
    }

    public Date getSickdate() {
        return sickdate;
    }

    public void setSickdate(Date sickdate) {
        this.sickdate = sickdate;
    }

    public String getSickadvice() {
        return sickadvice;
    }

    public void setSickadvice(String sickadvice) {
        this.sickadvice = sickadvice == null ? null : sickadvice.trim();
    }

    public String getSickhospital() {
        return sickhospital;
    }

    public void setSickhospital(String sickhospital) {
        this.sickhospital = sickhospital == null ? null : sickhospital.trim();
    }

    public String getSicktype() {
        return sicktype;
    }

    public void setSicktype(String sicktype) {
        this.sicktype = sicktype == null ? null : sicktype.trim();
    }
}
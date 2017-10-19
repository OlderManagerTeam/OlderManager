package com.sds.em.po;

import java.util.Date;

public class Olderbase {
    private Integer olderid;

    private String oldername;

    private String oldersex;

    private Date olderbirthday;

    private String olderpassword;

    private String oldertel;

    private String olderaddress;

    private String oldersinglestatus;

    private String olderide;

    private String oldernation;

    private String olderheadurl;

    private Integer olderpoint;

    private Integer olderbranchid;

    private Integer odermaxpoint;

    public Integer getOlderid() {
        return olderid;
    }

    public void setOlderid(Integer olderid) {
        this.olderid = olderid;
    }

    public String getOldername() {
        return oldername;
    }

    public void setOldername(String oldername) {
        this.oldername = oldername == null ? null : oldername.trim();
    }

    public String getOldersex() {
        return oldersex;
    }

    public void setOldersex(String oldersex) {
        this.oldersex = oldersex == null ? null : oldersex.trim();
    }

    public Date getOlderbirthday() {
        return olderbirthday;
    }

    public void setOlderbirthday(Date olderbirthday) {
        this.olderbirthday = olderbirthday;
    }

    public String getOlderpassword() {
        return olderpassword;
    }

    public void setOlderpassword(String olderpassword) {
        this.olderpassword = olderpassword == null ? null : olderpassword.trim();
    }

    public String getOldertel() {
        return oldertel;
    }

    public void setOldertel(String oldertel) {
        this.oldertel = oldertel == null ? null : oldertel.trim();
    }

    public String getOlderaddress() {
        return olderaddress;
    }

    public void setOlderaddress(String olderaddress) {
        this.olderaddress = olderaddress == null ? null : olderaddress.trim();
    }

    public String getOldersinglestatus() {
        return oldersinglestatus;
    }

    public void setOldersinglestatus(String oldersinglestatus) {
        this.oldersinglestatus = oldersinglestatus == null ? null : oldersinglestatus.trim();
    }

    public String getOlderide() {
        return olderide;
    }

    public void setOlderide(String olderide) {
        this.olderide = olderide == null ? null : olderide.trim();
    }

    public String getOldernation() {
        return oldernation;
    }

    public void setOldernation(String oldernation) {
        this.oldernation = oldernation == null ? null : oldernation.trim();
    }

    public String getOlderheadurl() {
        return olderheadurl;
    }

    public void setOlderheadurl(String olderheadurl) {
        this.olderheadurl = olderheadurl == null ? null : olderheadurl.trim();
    }

    public Integer getOlderpoint() {
        return olderpoint;
    }

    public void setOlderpoint(Integer olderpoint) {
        this.olderpoint = olderpoint;
    }

    public Integer getOlderbranchid() {
        return olderbranchid;
    }

    public void setOlderbranchid(Integer olderbranchid) {
        this.olderbranchid = olderbranchid;
    }

    public Integer getOdermaxpoint() {
        return odermaxpoint;
    }

    public void setOdermaxpoint(Integer odermaxpoint) {
        this.odermaxpoint = odermaxpoint;
    }
}
package com.sds.em.po;

import java.util.Date;

public class Productgroup {
    private Integer groupid;

    private Date grouppublishdate;

    private Date groupstartdate;

    private Date groupfinishdate;

    private Integer groupproductid;

    private Integer grouppresentpeople;

    private Integer grouptotalpeople;

    private Float groupdiscountprice;

    private String groupstatus;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Date getGrouppublishdate() {
        return grouppublishdate;
    }

    public void setGrouppublishdate(Date grouppublishdate) {
        this.grouppublishdate = grouppublishdate;
    }

    public Date getGroupstartdate() {
        return groupstartdate;
    }

    public void setGroupstartdate(Date groupstartdate) {
        this.groupstartdate = groupstartdate;
    }

    public Date getGroupfinishdate() {
        return groupfinishdate;
    }

    public void setGroupfinishdate(Date groupfinishdate) {
        this.groupfinishdate = groupfinishdate;
    }

    public Integer getGroupproductid() {
        return groupproductid;
    }

    public void setGroupproductid(Integer groupproductid) {
        this.groupproductid = groupproductid;
    }

    public Integer getGrouppresentpeople() {
        return grouppresentpeople;
    }

    public void setGrouppresentpeople(Integer grouppresentpeople) {
        this.grouppresentpeople = grouppresentpeople;
    }

    public Integer getGrouptotalpeople() {
        return grouptotalpeople;
    }

    public void setGrouptotalpeople(Integer grouptotalpeople) {
        this.grouptotalpeople = grouptotalpeople;
    }

    public Float getGroupdiscountprice() {
        return groupdiscountprice;
    }

    public void setGroupdiscountprice(Float groupdiscountprice) {
        this.groupdiscountprice = groupdiscountprice;
    }

    public String getGroupstatus() {
        return groupstatus;
    }

    public void setGroupstatus(String groupstatus) {
        this.groupstatus = groupstatus == null ? null : groupstatus.trim();
    }
}
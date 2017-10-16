package com.sds.em.po;

public class Stafftoken {
    private Integer staffid;

    private String stafftoken;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStafftoken() {
        return stafftoken;
    }

    public void setStafftoken(String stafftoken) {
        this.stafftoken = stafftoken == null ? null : stafftoken.trim();
    }
}
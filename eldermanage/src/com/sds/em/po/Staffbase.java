package com.sds.em.po;

import java.util.Date;

public class Staffbase {
    private Integer staffid;

    private String staffname;

    private String staffsex;

    private Date staffbirthday;

    private String staffiide;

    private String stafftel;

    private String staffcode;

    private String staffimg;

    private String staffaddress;

    private Integer staffdepartmentid;

    private String staffpassword;

    private Integer staffroleid;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex == null ? null : staffsex.trim();
    }

    public Date getStaffbirthday() {
        return staffbirthday;
    }

    public void setStaffbirthday(Date staffbirthday) {
        this.staffbirthday = staffbirthday;
    }

    public String getStaffiide() {
        return staffiide;
    }

    public void setStaffiide(String staffiide) {
        this.staffiide = staffiide == null ? null : staffiide.trim();
    }

    public String getStafftel() {
        return stafftel;
    }

    public void setStafftel(String stafftel) {
        this.stafftel = stafftel == null ? null : stafftel.trim();
    }

    public String getStaffcode() {
        return staffcode;
    }

    public void setStaffcode(String staffcode) {
        this.staffcode = staffcode == null ? null : staffcode.trim();
    }

    public String getStaffimg() {
        return staffimg;
    }

    public void setStaffimg(String staffimg) {
        this.staffimg = staffimg == null ? null : staffimg.trim();
    }

    public String getStaffaddress() {
        return staffaddress;
    }

    public void setStaffaddress(String staffaddress) {
        this.staffaddress = staffaddress == null ? null : staffaddress.trim();
    }

    public Integer getStaffdepartmentid() {
        return staffdepartmentid;
    }

    public void setStaffdepartmentid(Integer staffdepartmentid) {
        this.staffdepartmentid = staffdepartmentid;
    }

    public String getStaffpassword() {
        return staffpassword;
    }

    public void setStaffpassword(String staffpassword) {
        this.staffpassword = staffpassword == null ? null : staffpassword.trim();
    }

    public Integer getStaffroleid() {
        return staffroleid;
    }

    public void setStaffroleid(Integer staffroleid) {
        this.staffroleid = staffroleid;
    }
}
package com.sds.em.po;

public class Droit {
    private Integer droitid;

    private String droitname;

    private Integer droitroleid;

    public Integer getDroitid() {
        return droitid;
    }

    public void setDroitid(Integer droitid) {
        this.droitid = droitid;
    }

    public String getDroitname() {
        return droitname;
    }

    public void setDroitname(String droitname) {
        this.droitname = droitname == null ? null : droitname.trim();
    }

    public Integer getDroitroleid() {
        return droitroleid;
    }

    public void setDroitroleid(Integer droitroleid) {
        this.droitroleid = droitroleid;
    }
}
package com.sds.em.po;

public class Producttype {
    private Integer typeid;

    private String typecontent;

    private Integer typenumber;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypecontent() {
        return typecontent;
    }

    public void setTypecontent(String typecontent) {
        this.typecontent = typecontent == null ? null : typecontent.trim();
    }

    public Integer getTypenumber() {
        return typenumber;
    }

    public void setTypenumber(Integer typenumber) {
        this.typenumber = typenumber;
    }
}
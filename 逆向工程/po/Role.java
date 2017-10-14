package com.sds.em.po;

public class Role {
    private Integer roleid;

    private String rolecontent;

    private Integer depaertmentid;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolecontent() {
        return rolecontent;
    }

    public void setRolecontent(String rolecontent) {
        this.rolecontent = rolecontent == null ? null : rolecontent.trim();
    }

    public Integer getDepaertmentid() {
        return depaertmentid;
    }

    public void setDepaertmentid(Integer depaertmentid) {
        this.depaertmentid = depaertmentid;
    }
}
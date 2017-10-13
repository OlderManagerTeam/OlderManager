package com.sds.em.po;

public class Role {
    private Integer roleid;

    private String rolecontent;

    private Integer rolestaffid;

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

    public Integer getRolestaffid() {
        return rolestaffid;
    }

    public void setRolestaffid(Integer rolestaffid) {
        this.rolestaffid = rolestaffid;
    }
}
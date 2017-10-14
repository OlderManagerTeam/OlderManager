package com.sds.em.po;

import java.util.Date;

public class Action {
    private Integer actionid;

    private Date actionstartdate;

    private String actionintro;

    private String actionname;

    private String actionaddress;

    private Integer actionstatus;

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }

    public Date getActionstartdate() {
        return actionstartdate;
    }

    public void setActionstartdate(Date actionstartdate) {
        this.actionstartdate = actionstartdate;
    }

    public String getActionintro() {
        return actionintro;
    }

    public void setActionintro(String actionintro) {
        this.actionintro = actionintro == null ? null : actionintro.trim();
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    public String getActionaddress() {
        return actionaddress;
    }

    public void setActionaddress(String actionaddress) {
        this.actionaddress = actionaddress == null ? null : actionaddress.trim();
    }

    public Integer getActionstatus() {
        return actionstatus;
    }

    public void setActionstatus(Integer actionstatus) {
        this.actionstatus = actionstatus;
    }
}
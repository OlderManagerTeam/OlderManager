package com.sds.em.po;

import java.util.Date;

public class Action {
    private Integer actionid;

    private Integer actionbranchid;

    private Date actionstartdate;

    private String actionintro;

    private String actionname;

    private String actionaddress;

    private String actionstatus;

    private Integer actionenroll;

    private Integer actiontotal;

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }

    public Integer getActionbranchid() {
        return actionbranchid;
    }

    public void setActionbranchid(Integer actionbranchid) {
        this.actionbranchid = actionbranchid;
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

    public String getActionstatus() {
        return actionstatus;
    }

    public void setActionstatus(String actionstatus) {
        this.actionstatus = actionstatus == null ? null : actionstatus.trim();
    }

    public Integer getActionenroll() {
        return actionenroll;
    }

    public void setActionenroll(Integer actionenroll) {
        this.actionenroll = actionenroll;
    }

    public Integer getActiontotal() {
        return actiontotal;
    }

    public void setActiontotal(Integer actiontotal) {
        this.actiontotal = actiontotal;
    }
}
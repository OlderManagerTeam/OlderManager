package com.sds.em.po;

import java.util.Date;

public class Queue {
    private Integer queueid;

    private Integer queueassistantid;

    private Integer queueolderid;

    private Date queuedate;

    private String queuetype;

    public Integer getQueueid() {
        return queueid;
    }

    public void setQueueid(Integer queueid) {
        this.queueid = queueid;
    }

    public Integer getQueueassistantid() {
        return queueassistantid;
    }

    public void setQueueassistantid(Integer queueassistantid) {
        this.queueassistantid = queueassistantid;
    }

    public Integer getQueueolderid() {
        return queueolderid;
    }

    public void setQueueolderid(Integer queueolderid) {
        this.queueolderid = queueolderid;
    }

    public Date getQueuedate() {
        return queuedate;
    }

    public void setQueuedate(Date queuedate) {
        this.queuedate = queuedate;
    }

    public String getQueuetype() {
        return queuetype;
    }

    public void setQueuetype(String queuetype) {
        this.queuetype = queuetype == null ? null : queuetype.trim();
    }
}
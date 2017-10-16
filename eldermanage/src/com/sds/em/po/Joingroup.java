package com.sds.em.po;

import java.util.Date;

public class Joingroup {
    private Integer joingroupid;

    private Integer joinid;

    private Integer joinolderid;

    private Date joindate;

    public Integer getJoingroupid() {
        return joingroupid;
    }

    public void setJoingroupid(Integer joingroupid) {
        this.joingroupid = joingroupid;
    }

    public Integer getJoinid() {
        return joinid;
    }

    public void setJoinid(Integer joinid) {
        this.joinid = joinid;
    }

    public Integer getJoinolderid() {
        return joinolderid;
    }

    public void setJoinolderid(Integer joinolderid) {
        this.joinolderid = joinolderid;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }
}
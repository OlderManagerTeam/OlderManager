package com.sds.em.po;

import java.util.Date;

public class Lecturerecord {
    private Integer lrecordid;

    private Integer lrecordolderid;

    private Date lrecorddate;

    private Integer lrecordlectureid;

    public Integer getLrecordid() {
        return lrecordid;
    }

    public void setLrecordid(Integer lrecordid) {
        this.lrecordid = lrecordid;
    }

    public Integer getLrecordolderid() {
        return lrecordolderid;
    }

    public void setLrecordolderid(Integer lrecordolderid) {
        this.lrecordolderid = lrecordolderid;
    }

    public Date getLrecorddate() {
        return lrecorddate;
    }

    public void setLrecorddate(Date lrecorddate) {
        this.lrecorddate = lrecorddate;
    }

    public Integer getLrecordlectureid() {
        return lrecordlectureid;
    }

    public void setLrecordlectureid(Integer lrecordlectureid) {
        this.lrecordlectureid = lrecordlectureid;
    }
}
package com.sds.em.po;

import java.util.Date;

public class Actionrecord {
    private Integer arecordid;

    private Integer arecordolderid;

    private Integer arecordactionid;

    private Date arecorddate;

    public Integer getArecordid() {
        return arecordid;
    }

    public void setArecordid(Integer arecordid) {
        this.arecordid = arecordid;
    }

    public Integer getArecordolderid() {
        return arecordolderid;
    }

    public void setArecordolderid(Integer arecordolderid) {
        this.arecordolderid = arecordolderid;
    }

    public Integer getArecordactionid() {
        return arecordactionid;
    }

    public void setArecordactionid(Integer arecordactionid) {
        this.arecordactionid = arecordactionid;
    }

    public Date getArecorddate() {
        return arecorddate;
    }

    public void setArecorddate(Date arecorddate) {
        this.arecorddate = arecorddate;
    }
}
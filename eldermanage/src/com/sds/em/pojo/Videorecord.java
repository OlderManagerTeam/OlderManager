package com.sds.em.pojo;

import java.util.Date;

public class Videorecord {
    private Integer vrecordid;

    private Integer vrecordolderid;

    private Integer vrecordvideoid;

    private Date vrecorddate;

    public Integer getVrecordid() {
        return vrecordid;
    }

    public void setVrecordid(Integer vrecordid) {
        this.vrecordid = vrecordid;
    }

    public Integer getVrecordolderid() {
        return vrecordolderid;
    }

    public void setVrecordolderid(Integer vrecordolderid) {
        this.vrecordolderid = vrecordolderid;
    }

    public Integer getVrecordvideoid() {
        return vrecordvideoid;
    }

    public void setVrecordvideoid(Integer vrecordvideoid) {
        this.vrecordvideoid = vrecordvideoid;
    }

    public Date getVrecorddate() {
        return vrecorddate;
    }

    public void setVrecorddate(Date vrecorddate) {
        this.vrecorddate = vrecorddate;
    }
}
package com.sds.em.po;

import java.util.Date;

public class Productrate {
    private Integer rateid;

    private Integer rateolderid;

    private Integer rateorderid;

    private Integer ratestar;

    private String ratecontent;

    private Date ratedate;

    public Integer getRateid() {
        return rateid;
    }

    public void setRateid(Integer rateid) {
        this.rateid = rateid;
    }

    public Integer getRateolderid() {
        return rateolderid;
    }

    public void setRateolderid(Integer rateolderid) {
        this.rateolderid = rateolderid;
    }

    public Integer getRateorderid() {
        return rateorderid;
    }

    public void setRateorderid(Integer rateorderid) {
        this.rateorderid = rateorderid;
    }

    public Integer getRatestar() {
        return ratestar;
    }

    public void setRatestar(Integer ratestar) {
        this.ratestar = ratestar;
    }

    public String getRatecontent() {
        return ratecontent;
    }

    public void setRatecontent(String ratecontent) {
        this.ratecontent = ratecontent == null ? null : ratecontent.trim();
    }

    public Date getRatedate() {
        return ratedate;
    }

    public void setRatedate(Date ratedate) {
        this.ratedate = ratedate;
    }
}
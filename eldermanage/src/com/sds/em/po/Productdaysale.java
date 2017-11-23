package com.sds.em.po;

import java.util.Date;

public class Productdaysale {
    private Long pdsid;

    private Integer pdsproductid;

    private Integer pdsdaysale;

    private Date pdsdaydate;

    private Integer storedaybrowse;

    public Long getPdsid() {
        return pdsid;
    }

    public void setPdsid(Long pdsid) {
        this.pdsid = pdsid;
    }

    public Integer getPdsproductid() {
        return pdsproductid;
    }

    public void setPdsproductid(Integer pdsproductid) {
        this.pdsproductid = pdsproductid;
    }

    public Integer getPdsdaysale() {
        return pdsdaysale;
    }

    public void setPdsdaysale(Integer pdsdaysale) {
        this.pdsdaysale = pdsdaysale;
    }

    public Date getPdsdaydate() {
        return pdsdaydate;
    }

    public void setPdsdaydate(Date pdsdaydate) {
        this.pdsdaydate = pdsdaydate;
    }

    public Integer getStoredaybrowse() {
        return storedaybrowse;
    }

    public void setStoredaybrowse(Integer storedaybrowse) {
        this.storedaybrowse = storedaybrowse;
    }
}
package com.sds.em.po;

public class Productpiclist {
    private Integer ppicid;

    private Integer pproductid;

    private String ppicurl;

    public Integer getPpicid() {
        return ppicid;
    }

    public void setPpicid(Integer ppicid) {
        this.ppicid = ppicid;
    }

    public Integer getPproductid() {
        return pproductid;
    }

    public void setPproductid(Integer pproductid) {
        this.pproductid = pproductid;
    }

    public String getPpicurl() {
        return ppicurl;
    }

    public void setPpicurl(String ppicurl) {
        this.ppicurl = ppicurl == null ? null : ppicurl.trim();
    }
}
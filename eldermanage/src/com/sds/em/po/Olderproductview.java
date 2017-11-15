package com.sds.em.po;

import java.util.Date;

public class Olderproductview {
    private Integer productviewid;

    private Integer pviewproductid;

    private Integer pviewolderid;

    private Integer pviewocount;

    private Date pviewdate;

    public Integer getProductviewid() {
        return productviewid;
    }

    public void setProductviewid(Integer productviewid) {
        this.productviewid = productviewid;
    }

    public Integer getPviewproductid() {
        return pviewproductid;
    }

    public void setPviewproductid(Integer pviewproductid) {
        this.pviewproductid = pviewproductid;
    }

    public Integer getPviewolderid() {
        return pviewolderid;
    }

    public void setPviewolderid(Integer pviewolderid) {
        this.pviewolderid = pviewolderid;
    }

    public Integer getPviewocount() {
        return pviewocount;
    }

    public void setPviewocount(Integer pviewocount) {
        this.pviewocount = pviewocount;
    }

    public Date getPviewdate() {
        return pviewdate;
    }

    public void setPviewdate(Date pviewdate) {
        this.pviewdate = pviewdate;
    }
}
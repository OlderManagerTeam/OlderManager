package com.sds.em.po;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Integer orderolderid;

    private Date orderdate;

    private String orderstatus;

    private Float ordertotal;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderolderid() {
        return orderolderid;
    }

    public void setOrderolderid(Integer orderolderid) {
        this.orderolderid = orderolderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public Float getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(Float ordertotal) {
        this.ordertotal = ordertotal;
    }
}
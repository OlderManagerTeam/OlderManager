package com.sds.em.po;

public class Orderlist {
    private Integer orderlistid;

    private Integer orderlistfid;

    private Integer orderproductid;

    private Integer orderproductcount;

    private Float orderdiscountprice;

    public Integer getOrderlistid() {
        return orderlistid;
    }

    public void setOrderlistid(Integer orderlistid) {
        this.orderlistid = orderlistid;
    }

    public Integer getOrderlistfid() {
        return orderlistfid;
    }

    public void setOrderlistfid(Integer orderlistfid) {
        this.orderlistfid = orderlistfid;
    }

    public Integer getOrderproductid() {
        return orderproductid;
    }

    public void setOrderproductid(Integer orderproductid) {
        this.orderproductid = orderproductid;
    }

    public Integer getOrderproductcount() {
        return orderproductcount;
    }

    public void setOrderproductcount(Integer orderproductcount) {
        this.orderproductcount = orderproductcount;
    }

    public Float getOrderdiscountprice() {
        return orderdiscountprice;
    }

    public void setOrderdiscountprice(Float orderdiscountprice) {
        this.orderdiscountprice = orderdiscountprice;
    }
}
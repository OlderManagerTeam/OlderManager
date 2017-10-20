package com.sds.em.po;

import java.util.Date;

public class Product {
    private Integer productid;

    private String productname;

    private Float productprice;

    private Integer producttypenumber;

    private String productinfo;

    private String productimg;

    private Float productweight;

    private Date productupondate;

    private Float productdiscountprice;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Float getProductprice() {
        return productprice;
    }

    public void setProductprice(Float productprice) {
        this.productprice = productprice;
    }

    public Integer getProducttypenumber() {
        return producttypenumber;
    }

    public void setProducttypenumber(Integer producttypenumber) {
        this.producttypenumber = producttypenumber;
    }

    public String getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(String productinfo) {
        this.productinfo = productinfo == null ? null : productinfo.trim();
    }

    public String getProductimg() {
        return productimg;
    }

    public void setProductimg(String productimg) {
        this.productimg = productimg == null ? null : productimg.trim();
    }

    public Float getProductweight() {
        return productweight;
    }

    public void setProductweight(Float productweight) {
        this.productweight = productweight;
    }

    public Date getProductupondate() {
        return productupondate;
    }

    public void setProductupondate(Date productupondate) {
        this.productupondate = productupondate;
    }

    public Float getProductdiscountprice() {
        return productdiscountprice;
    }

    public void setProductdiscountprice(Float productdiscountprice) {
        this.productdiscountprice = productdiscountprice;
    }
}
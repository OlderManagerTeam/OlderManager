package com.sds.em.po;

public class Cart {
    private Integer cartid;

    private Integer cartolderid;

    private Integer cartproductid;

    private Integer cartcount;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getCartolderid() {
        return cartolderid;
    }

    public void setCartolderid(Integer cartolderid) {
        this.cartolderid = cartolderid;
    }

    public Integer getCartproductid() {
        return cartproductid;
    }

    public void setCartproductid(Integer cartproductid) {
        this.cartproductid = cartproductid;
    }

    public Integer getCartcount() {
        return cartcount;
    }

    public void setCartcount(Integer cartcount) {
        this.cartcount = cartcount;
    }
}
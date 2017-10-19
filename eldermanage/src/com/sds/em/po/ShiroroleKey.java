package com.sds.em.po;

public class ShiroroleKey {
    private Integer shirorolestaffid;

    private String shirorole;

    public Integer getShirorolestaffid() {
        return shirorolestaffid;
    }

    public void setShirorolestaffid(Integer shirorolestaffid) {
        this.shirorolestaffid = shirorolestaffid;
    }

    public String getShirorole() {
        return shirorole;
    }

    public void setShirorole(String shirorole) {
        this.shirorole = shirorole == null ? null : shirorole.trim();
    }
}
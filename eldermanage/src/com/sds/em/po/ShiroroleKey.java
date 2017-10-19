package com.sds.em.po;

public class ShiroroleKey {
    private String shirotel;

    private String shirorole;

    public String getShirotel() {
        return shirotel;
    }

    public void setShirotel(String shirotel) {
        this.shirotel = shirotel == null ? null : shirotel.trim();
    }

    public String getShirorole() {
        return shirorole;
    }

    public void setShirorole(String shirorole) {
        this.shirorole = shirorole == null ? null : shirorole.trim();
    }
}
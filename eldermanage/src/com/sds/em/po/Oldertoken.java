package com.sds.em.po;

public class Oldertoken {
    private Integer olderid;

    private String oldertoken;

    public Integer getOlderid() {
        return olderid;
    }

    public void setOlderid(Integer olderid) {
        this.olderid = olderid;
    }

    public String getOldertoken() {
        return oldertoken;
    }

    public void setOldertoken(String oldertoken) {
        this.oldertoken = oldertoken == null ? null : oldertoken.trim();
    }
}
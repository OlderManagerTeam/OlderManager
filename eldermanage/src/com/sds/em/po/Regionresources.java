package com.sds.em.po;

public class Regionresources {
    private Integer regionresourcesid;

    private String regionresourcesrname;

    private Integer resourcesdroitid;

    public Integer getRegionresourcesid() {
        return regionresourcesid;
    }

    public void setRegionresourcesid(Integer regionresourcesid) {
        this.regionresourcesid = regionresourcesid;
    }

    public String getRegionresourcesrname() {
        return regionresourcesrname;
    }

    public void setRegionresourcesrname(String regionresourcesrname) {
        this.regionresourcesrname = regionresourcesrname == null ? null : regionresourcesrname.trim();
    }

    public Integer getResourcesdroitid() {
        return resourcesdroitid;
    }

    public void setResourcesdroitid(Integer resourcesdroitid) {
        this.resourcesdroitid = resourcesdroitid;
    }
}
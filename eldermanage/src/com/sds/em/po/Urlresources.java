package com.sds.em.po;

public class Urlresources {
    private Integer resourcesid;

    private Integer resourcesdroitid;

    private String resourcesname;

    public Integer getResourcesid() {
        return resourcesid;
    }

    public void setResourcesid(Integer resourcesid) {
        this.resourcesid = resourcesid;
    }

    public Integer getResourcesdroitid() {
        return resourcesdroitid;
    }

    public void setResourcesdroitid(Integer resourcesdroitid) {
        this.resourcesdroitid = resourcesdroitid;
    }

    public String getResourcesname() {
        return resourcesname;
    }

    public void setResourcesname(String resourcesname) {
        this.resourcesname = resourcesname == null ? null : resourcesname.trim();
    }
}
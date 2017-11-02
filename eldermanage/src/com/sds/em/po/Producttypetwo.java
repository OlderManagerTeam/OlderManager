package com.sds.em.po;

public class Producttypetwo {
    private Integer typetwoid;

    private String typetwocontent;

    private Integer typetwotypeid;

    public Integer getTypetwoid() {
        return typetwoid;
    }

    public void setTypetwoid(Integer typetwoid) {
        this.typetwoid = typetwoid;
    }

    public String getTypetwocontent() {
        return typetwocontent;
    }

    public void setTypetwocontent(String typetwocontent) {
        this.typetwocontent = typetwocontent == null ? null : typetwocontent.trim();
    }

    public Integer getTypetwotypeid() {
        return typetwotypeid;
    }

    public void setTypetwotypeid(Integer typetwotypeid) {
        this.typetwotypeid = typetwotypeid;
    }
}
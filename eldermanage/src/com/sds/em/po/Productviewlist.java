package com.sds.em.po;

public class Productviewlist {
    private Integer pviewpicid;

    private Integer pviewpicproductid;

    private String pviewpicbigpic;

    private String pviewpicpic;

    private String pviewpicsmallpic;

    public Integer getPviewpicid() {
        return pviewpicid;
    }

    public void setPviewpicid(Integer pviewpicid) {
        this.pviewpicid = pviewpicid;
    }

    public Integer getPviewpicproductid() {
        return pviewpicproductid;
    }

    public void setPviewpicproductid(Integer pviewpicproductid) {
        this.pviewpicproductid = pviewpicproductid;
    }

    public String getPviewpicbigpic() {
        return pviewpicbigpic;
    }

    public void setPviewpicbigpic(String pviewpicbigpic) {
        this.pviewpicbigpic = pviewpicbigpic == null ? null : pviewpicbigpic.trim();
    }

    public String getPviewpicpic() {
        return pviewpicpic;
    }

    public void setPviewpicpic(String pviewpicpic) {
        this.pviewpicpic = pviewpicpic == null ? null : pviewpicpic.trim();
    }

    public String getPviewpicsmallpic() {
        return pviewpicsmallpic;
    }

    public void setPviewpicsmallpic(String pviewpicsmallpic) {
        this.pviewpicsmallpic = pviewpicsmallpic == null ? null : pviewpicsmallpic.trim();
    }
}
package com.sds.em.po;

public class Newspicturelist {
    private Integer newspicturelistid;

    private String newspictureurl;

    private Integer newspictureid;

    public Integer getNewspicturelistid() {
        return newspicturelistid;
    }

    public void setNewspicturelistid(Integer newspicturelistid) {
        this.newspicturelistid = newspicturelistid;
    }

    public String getNewspictureurl() {
        return newspictureurl;
    }

    public void setNewspictureurl(String newspictureurl) {
        this.newspictureurl = newspictureurl == null ? null : newspictureurl.trim();
    }

    public Integer getNewspictureid() {
        return newspictureid;
    }

    public void setNewspictureid(Integer newspictureid) {
        this.newspictureid = newspictureid;
    }
}
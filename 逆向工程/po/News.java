package com.sds.em.po;

import java.util.Date;

public class News {
    private Integer newsid;

    private String newstitle;

    private String newstype;

    private String newsimg;

    private Integer newseditorid;

    private Date newsissueddate;

    private String newsintro;

    private String newscontent;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewstype() {
        return newstype;
    }

    public void setNewstype(String newstype) {
        this.newstype = newstype == null ? null : newstype.trim();
    }

    public String getNewsimg() {
        return newsimg;
    }

    public void setNewsimg(String newsimg) {
        this.newsimg = newsimg == null ? null : newsimg.trim();
    }

    public Integer getNewseditorid() {
        return newseditorid;
    }

    public void setNewseditorid(Integer newseditorid) {
        this.newseditorid = newseditorid;
    }

    public Date getNewsissueddate() {
        return newsissueddate;
    }

    public void setNewsissueddate(Date newsissueddate) {
        this.newsissueddate = newsissueddate;
    }

    public String getNewsintro() {
        return newsintro;
    }

    public void setNewsintro(String newsintro) {
        this.newsintro = newsintro == null ? null : newsintro.trim();
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }
}
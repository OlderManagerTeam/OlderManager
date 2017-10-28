package com.sds.em.po;

import java.util.Date;

public class Video {
    private Integer videoid;

    private String videopicurl;

    private String videourl;

    private String videoname;

    private String videointro;

    private String videodetail;

    private String videotime;

    private Date videopublishdate;

    private Integer videoheat;

    private String videopartition;

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public String getVideopicurl() {
        return videopicurl;
    }

    public void setVideopicurl(String videopicurl) {
        this.videopicurl = videopicurl == null ? null : videopicurl.trim();
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideointro() {
        return videointro;
    }

    public void setVideointro(String videointro) {
        this.videointro = videointro == null ? null : videointro.trim();
    }

    public String getVideodetail() {
        return videodetail;
    }

    public void setVideodetail(String videodetail) {
        this.videodetail = videodetail == null ? null : videodetail.trim();
    }

    public String getVideotime() {
        return videotime;
    }

    public void setVideotime(String videotime) {
        this.videotime = videotime == null ? null : videotime.trim();
    }

    public Date getVideopublishdate() {
        return videopublishdate;
    }

    public void setVideopublishdate(Date videopublishdate) {
        this.videopublishdate = videopublishdate;
    }

    public Integer getVideoheat() {
        return videoheat;
    }

    public void setVideoheat(Integer videoheat) {
        this.videoheat = videoheat;
    }

    public String getVideopartition() {
        return videopartition;
    }

    public void setVideopartition(String videopartition) {
        this.videopartition = videopartition == null ? null : videopartition.trim();
    }
}
package com.sds.em.po;

import java.util.Date;

public class Lecture {
    private Integer lectureid;

    private String lecturename;

    private String lectureintro;

    private Integer lectureenroll;

    private Integer lecturetotal;

    private Date lecturepublishdate;

    private String lecturestatus;

    private String lectureaddress;

    private Integer lecturebranchid;

    public Integer getLectureid() {
        return lectureid;
    }

    public void setLectureid(Integer lectureid) {
        this.lectureid = lectureid;
    }

    public String getLecturename() {
        return lecturename;
    }

    public void setLecturename(String lecturename) {
        this.lecturename = lecturename == null ? null : lecturename.trim();
    }

    public String getLectureintro() {
        return lectureintro;
    }

    public void setLectureintro(String lectureintro) {
        this.lectureintro = lectureintro == null ? null : lectureintro.trim();
    }

    public Integer getLectureenroll() {
        return lectureenroll;
    }

    public void setLectureenroll(Integer lectureenroll) {
        this.lectureenroll = lectureenroll;
    }

    public Integer getLecturetotal() {
        return lecturetotal;
    }

    public void setLecturetotal(Integer lecturetotal) {
        this.lecturetotal = lecturetotal;
    }

    public Date getLecturepublishdate() {
        return lecturepublishdate;
    }

    public void setLecturepublishdate(Date lecturepublishdate) {
        this.lecturepublishdate = lecturepublishdate;
    }

    public String getLecturestatus() {
        return lecturestatus;
    }

    public void setLecturestatus(String lecturestatus) {
        this.lecturestatus = lecturestatus == null ? null : lecturestatus.trim();
    }

    public String getLectureaddress() {
        return lectureaddress;
    }

    public void setLectureaddress(String lectureaddress) {
        this.lectureaddress = lectureaddress == null ? null : lectureaddress.trim();
    }

    public Integer getLecturebranchid() {
        return lecturebranchid;
    }

    public void setLecturebranchid(Integer lecturebranchid) {
        this.lecturebranchid = lecturebranchid;
    }
}
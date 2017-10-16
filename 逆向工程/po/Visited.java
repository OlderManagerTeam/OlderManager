package com.sds.em.po;

import java.util.Date;

public class Visited {
    private Integer visitedid;

    private Integer visitedassistantid;

    private Integer visitedolderid;

    private String visitedjudgecontent;

    private Integer visitedjudgestar;

    private String visitedcontent;

    private Date visiteddate;

    public Integer getVisitedid() {
        return visitedid;
    }

    public void setVisitedid(Integer visitedid) {
        this.visitedid = visitedid;
    }

    public Integer getVisitedassistantid() {
        return visitedassistantid;
    }

    public void setVisitedassistantid(Integer visitedassistantid) {
        this.visitedassistantid = visitedassistantid;
    }

    public Integer getVisitedolderid() {
        return visitedolderid;
    }

    public void setVisitedolderid(Integer visitedolderid) {
        this.visitedolderid = visitedolderid;
    }

    public String getVisitedjudgecontent() {
        return visitedjudgecontent;
    }

    public void setVisitedjudgecontent(String visitedjudgecontent) {
        this.visitedjudgecontent = visitedjudgecontent == null ? null : visitedjudgecontent.trim();
    }

    public Integer getVisitedjudgestar() {
        return visitedjudgestar;
    }

    public void setVisitedjudgestar(Integer visitedjudgestar) {
        this.visitedjudgestar = visitedjudgestar;
    }

    public String getVisitedcontent() {
        return visitedcontent;
    }

    public void setVisitedcontent(String visitedcontent) {
        this.visitedcontent = visitedcontent == null ? null : visitedcontent.trim();
    }

    public Date getVisiteddate() {
        return visiteddate;
    }

    public void setVisiteddate(Date visiteddate) {
        this.visiteddate = visiteddate;
    }
}
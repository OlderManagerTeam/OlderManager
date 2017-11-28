package com.sds.em.po;

import java.util.Date;

public class Oldermessage {
    private Long messageid;

    private Integer messageolderid;

    private String messagecontent;

    private Date messagedate;

    private String messagetype;

    private String messagestatus;

    public Long getMessageid() {
        return messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    public Integer getMessageolderid() {
        return messageolderid;
    }

    public void setMessageolderid(Integer messageolderid) {
        this.messageolderid = messageolderid;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public Date getMessagedate() {
        return messagedate;
    }

    public void setMessagedate(Date messagedate) {
        this.messagedate = messagedate;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype == null ? null : messagetype.trim();
    }

    public String getMessagestatus() {
        return messagestatus;
    }

    public void setMessagestatus(String messagestatus) {
        this.messagestatus = messagestatus == null ? null : messagestatus.trim();
    }
}
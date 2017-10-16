package com.sds.em.po;

public class Security {
    private Integer securityid;

    private Integer securityquestionid;

    private Integer securitystaffid;

    private String securityanswer;

    public Integer getSecurityid() {
        return securityid;
    }

    public void setSecurityid(Integer securityid) {
        this.securityid = securityid;
    }

    public Integer getSecurityquestionid() {
        return securityquestionid;
    }

    public void setSecurityquestionid(Integer securityquestionid) {
        this.securityquestionid = securityquestionid;
    }

    public Integer getSecuritystaffid() {
        return securitystaffid;
    }

    public void setSecuritystaffid(Integer securitystaffid) {
        this.securitystaffid = securitystaffid;
    }

    public String getSecurityanswer() {
        return securityanswer;
    }

    public void setSecurityanswer(String securityanswer) {
        this.securityanswer = securityanswer == null ? null : securityanswer.trim();
    }
}
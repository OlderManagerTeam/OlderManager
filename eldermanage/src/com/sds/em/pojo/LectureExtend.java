package com.sds.em.pojo;

import com.sds.em.po.Lecture;

public class LectureExtend {
	 private Lecture lecture;
	 private String publishDateStirng;
	 
	 private String joinStatus;
	 
	public String getJoinStatus() {
		return joinStatus;
	}
	public void setJoinStatus(String joinStatus) {
		this.joinStatus = joinStatus;
	}
	public Lecture getLecture() {
		return lecture;
	}
	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}
	public String getPublishDateStirng() {
		return publishDateStirng;
	}
	public void setPublishDateStirng(String publishDateStirng) {
		this.publishDateStirng = publishDateStirng;
	}

}

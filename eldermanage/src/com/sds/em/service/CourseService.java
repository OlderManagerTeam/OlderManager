package com.sds.em.service;

import java.util.Date;

import com.sds.em.po.Message;

public interface CourseService {
	//查询所有status为1的视频(返回课程列表)
	public Message allClasses();
	//返回课程（视频）详细
	public Message classDetail(int videoId);
	//添加老人观看课程记录
	public Message classRecord(String olderToken,int videoId,Date vRecordDate,float vRecordCurrentDate);
	//返回当前讲座
	public Message currentLecture();
	//老人报名讲座（添加讲座记录表）
	public Message joinLecture(String olderToken,int lectureId);
	//查看当地活动
	public Message localAction(String olderToken);
}

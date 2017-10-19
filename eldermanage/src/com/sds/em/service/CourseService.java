package com.sds.em.service;

import java.util.Date;

import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Oldertoken;
import com.sds.em.po.Video;

/**
 * 
 * @author 蔡文艳-2017-10-17
 *
 */
public interface CourseService {
	// 查询所有的视频(返回课程列表)
	public Message allClasses();

	 //返回课程（视频）详细
	 public Message classDetail(int videoId);

	// 添加老人观看课程记录
	public Message classRecord(int olderid,int videoid,Date lrecorddate);

	// 返回当前讲座
	public Message currentLecture(int olderid,int olderbranchid);

	// 老人报名讲座（添加讲座记录表/修改预约人数+1）
	public Message joinLecture(int olderid, int lectureId);

  //播放热度列表实现
   public Message videoHeatTop();
	
   //发布课程
   public Message publishVideos(Video video);
   //发布讲座
   public Message publishLectures(Lecture lecture);
}

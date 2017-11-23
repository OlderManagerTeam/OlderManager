package com.sds.em.service;

import java.util.Date;
import com.sds.em.po.Action;
import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Video;

/**
 * 
 * @author 蔡文艳-2017-10-17
 *
 */
public interface CourseService {
	
	// 登录后返回所有的视频(返回课程列表)
	public Message allClasses(int olderid,String videopartition);
	// 未登录时返回所有的视频(返回课程列表)
	public Message allClassesno(String videopartition);
	 //返回课程（视频）详细
	 public Message classDetail(int videoId);

	// 添加老人观看课程记录
	public Message classRecord(int olderid,int videoid,Date lrecorddate);

	// 返回未登录时的所有讲座
	public Message allLectureByolder(int olderid);
	// 返回未登录后的所有讲座
	public Message allLectures();
	
	// 老人报名讲座（添加讲座记录表/修改预约人数+1）
	public Message joinLecture(int olderid, int lectureId);

  //播放热度列表实现
   public Message videoHeatTop();
	
   //发布课程
   public Message publishVideos(Video video);
   //发布讲座
   public Message publishLectures(Lecture lecture);
   
   //老人查看自己的视频播放记录
   public Message videoRecord(int olderid);
  
   
   //活动发布
 	public Message publishAction(Action actions);
 	//老人登陆后看到该片区所有活动
 	public Message allActionsByolder(int olderid);
 	//所有活动
	public Message allActions();
 	//老人参加过的活动
 	public Message olderActions(int olderid);
 	//老人参加过的讲座
 	public Message olderLectures(int olderid);
 	//插入活动记录表
 	public Message joinAction(int olderid, int actionid);
 	//查看讲座详情
 	public Message selectLecturedetail(int lectureid);
 	//查看活动详情
 	public Message selelctActiondetail(int actionid);
 	//得到最新所有活动
 	public Message getAllNewActions();
 	//老年人取消参加某活动
 	public Message deleteActionRecord(int olderid,int actionid);
 	//老年人取消参加某讲座
 	public Message deleteLectureRecord(int olderid,int lectureid);
 	//收藏视频（插入视频收藏记录表）
 	public Message insertVCollectin(int olderid,int videoid);
	//查看已收藏视频
 	public Message videoCollectinRecord(int olderid);
}

package com.sds.em.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Action;
import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Video;
import com.sds.em.pojo.LoginMassage;
import com.sds.em.service.CourseService;

/**
 * “健康讲座”模块
 * @author 蔡文艳-2017-10-17 老人教育系统controller
 *
 */
@Controller
@RequestMapping("v1/course/")
public class CourseFrontController {

	@Autowired
	CourseService courseService;
	// 查询所有视频(返回课程列表)----写完--测试过
	@RequestMapping(method=RequestMethod.GET, value = "classes")
	public @ResponseBody Message allVideos(HttpSession s,String videopartition){//所有的视频
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {//未登录下的所有视频
			return courseService.allClassesno(videopartition);
		}else{//已登陆下的所有视频
			int olderid = loginMassage.getOlderid();
		    return courseService.allClasses(olderid,videopartition);
		}
	}
	
	//返回课程（视频）详细  ----写完
	@RequestMapping(method=RequestMethod.GET,value = "detail")
	public @ResponseBody Message classDetail(HttpSession s,int videoid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return courseService.classDetailNo(videoid);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return courseService.classDetail(olderid,videoid);
		}
	}
	
	//添加老人观看课程（视频）记录表       ----写完
	@RequestMapping(method =RequestMethod.POST,value = "record" )
	public @ResponseBody Message insertRecord(HttpSession s,int videoid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		return courseService.classRecord(olderid,videoid,new Date());
		}
	}
	
	//返回当前讲座        ----写完--测试过
	@RequestMapping(method = RequestMethod.GET,value ="lecture")
	public @ResponseBody Message currentLecture(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {//未登录
//			return new Message(false, "未登录", null);
			return courseService.allLectures();//未登录返回所有讲座
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		//老人登陆后看到该片区所有讲座
		return courseService.allLectureByolder(olderid);
	   }
   }	
	 
	//某老人报名讲座(参加讲座、将讲座已预约人数修改)   ----写完
	@RequestMapping(method = RequestMethod.POST,value="lecture/joinlectur")
	public @ResponseBody Message insertlectureRecord(HttpSession s,int lectureid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		  return courseService.joinLecture(olderid, lectureid);
		}
	}
	
	//插入活动记录表（老人报名参加活动）同时修改已报名人数---写完
		@RequestMapping(method = RequestMethod.POST,value="actions/joinaction")
		public @ResponseBody Message insertActionRecord(HttpSession s,int actionid){
			LoginMassage loginMassage = null;
			loginMassage = (LoginMassage) s.getAttribute("loginMassage");
			if (loginMassage == null) {
				return new Message(false, "未登录", null);
			}else{//已登陆
				int olderid = loginMassage.getOlderid();
				return courseService.joinAction(olderid, actionid);
			}
				
		}
	
   //播放热度列表实现     ----写完 通过--测试过
	@RequestMapping(method = RequestMethod.GET,value="video/heat")
	public @ResponseBody Message videoheat(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return courseService.videoHeatTopNo();
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
			return courseService.videoHeatTop(olderid);
		}
	}
	
	//发布课程
	@RequestMapping(method = RequestMethod.POST,value = "video/publishment")
	public @ResponseBody Message publish(@RequestBody Video video){
		return courseService.publishVideos(video);
	}
	
	
	//发布讲座
	@RequestMapping(method=RequestMethod.POST,value="lecture/publishment")
	public @ResponseBody Message publish(Lecture lecture){
		return courseService.publishLectures(lecture);
	}
	
	
	//老人查看自己的课程视频播放记录   -----写完--测试过
	@RequestMapping(method = RequestMethod.GET,value= "video/videorecord")
	public @ResponseBody Message videoRecord(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return courseService.videoRecord(olderid);
		}
	}
	//活动发布
	@RequestMapping(method = RequestMethod.POST,value= "actions")
	public @ResponseBody Message publishAction(Action actions){
		return courseService.publishAction(actions);
	}
	//查看所有活动 ---写完--测试过
	@RequestMapping(method= RequestMethod.GET,value="actions/allactions")
	public @ResponseBody Message allActions(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
//			return new Message(false, "未登录", null);
			return courseService.allActions();//未登录返回所有活动
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
            return courseService.allActionsByolder(olderid);
			}
		
	}
	//老人查看已报名参加的活动  ---写完
	@RequestMapping(method= RequestMethod.GET,value="actions/olderactions")
	public @ResponseBody Message olderactions(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
			
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		   return courseService.olderActions(olderid);
		   }
	}
	
	//老人查看已报名参加的讲座  ---写完
		@RequestMapping(method= RequestMethod.GET,value="actions/olderlecture")
		public  @ResponseBody Message olderlectures(HttpSession s){
			LoginMassage loginMassage = null;
			loginMassage = (LoginMassage) s.getAttribute("loginMassage");
			if (loginMassage == null) {
				return new Message(false, "未登录", null);
				
			}else{//已登陆
				int olderid = loginMassage.getOlderid();
			   return courseService.olderLectures(olderid);
			   }
		}
	
	
	
	
	//讲座详情
	@RequestMapping(method = RequestMethod.GET,value ="lecture/lecturedetail")
	public @ResponseBody Message lecturedetail(HttpSession s,int lectureid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return courseService.selectLecturedetailNo(lectureid);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return courseService.selectLecturedetail(olderid,lectureid);
		}
	}
	//活动详情
	@RequestMapping(method = RequestMethod.GET,value="actions/actiondetail")
	public @ResponseBody Message actiondetail(HttpSession s,int actionid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return courseService.selelctActiondetailNo(actionid);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return courseService.selelctActiondetail(olderid,actionid);
		}
	}
	
	//近期活动（得到最新所有活动）
	@RequestMapping(method = RequestMethod.GET,value="actions/newactions")
	public @ResponseBody Message actionNew(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return courseService.getAllNewActionsNo();
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return courseService.getAllNewActions(olderid);
		}
	}
	
	//老年人取消参加某活动
	@RequestMapping(method = RequestMethod.POST,value="actions/cancelaction")
	public @ResponseBody Message cancelAction(HttpSession s,int actionid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return courseService.deleteActionRecord(olderid,actionid);
		}
	
  
	}
	
	
	//老年人取消参加某讲座
	@RequestMapping(method = RequestMethod.POST,value="actions/cancellecture")
	public @ResponseBody Message cancelLecture(HttpSession s,int lectureid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return courseService.deleteLectureRecord(olderid,lectureid);
		}
	}
	
	//收藏视频（插入视频收藏记录表）
	@RequestMapping(method = RequestMethod.POST,value="video/collectionvideo")
	public @ResponseBody Message insertVideoCollectin(HttpSession s,int videoid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
			return courseService.insertVCollectin(olderid, videoid);
		}
			
	}
	
	//取消收藏视频
	@RequestMapping(method = RequestMethod.POST,value="video/cancelcollection")
	public @ResponseBody Message deleteVideoCollectin(HttpSession s,int videoid){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
			return courseService.deleteVCollectin(olderid, videoid);
		}
			
	}
	
	//查看已收藏视频
	@RequestMapping(method = RequestMethod.GET,value="video/videocollection")
	public @ResponseBody Message VideoCollectinRecord(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
			return courseService.videoCollectinRecord(olderid);
		}
			
	}
	
	

}

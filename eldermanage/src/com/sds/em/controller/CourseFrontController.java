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
	public @ResponseBody Message option(String videopartition){//所有的视频
		return courseService.allClasses(videopartition);
	}
	
	//返回课程（视频）详细  ----写完
	@RequestMapping(method=RequestMethod.GET,value = "detail")
	public @ResponseBody Message classDetail(int videoId){
		return courseService.classDetail(videoId);
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
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
			if(olderid != 0){//老人登陆后看到该片区所有讲座
				return courseService.allLectureByolder(olderid);
			}else
			   return courseService.allLectures();//未登录返回所有讲座
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
	
   //播放热度列表实现     ----写完 通过--测试过
	@RequestMapping(method = RequestMethod.GET,value="video/heat")
	public @ResponseBody Message videoheat(){
		return courseService.videoHeatTop();
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
			return new Message(false, "未登录", null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
			if(olderid != 0){//老人登陆后看到该片区所有活动
				return courseService.allActionsByolder(olderid);
			}else{
			return courseService.allActions();//未登录返回所有活动
			}
		}
	}
	//老人查看已报名参加过活动  ---写完
	@RequestMapping(method= RequestMethod.GET,value="actions/olderactions")
	public Message olderactions(HttpSession s){
		int olderid = (int) s.getAttribute("olderid");
		int olderbranchid = (int) s.getAttribute("olderbranchid");
		return courseService.olderActions(olderid,olderbranchid);
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
	
	//讲座详情
	@RequestMapping(method = RequestMethod.GET,value ="lecture/lecturedetail")
	public @ResponseBody Message lecturedetail(int lectureid){
		return courseService.selectLecturedetail(lectureid);
	}
	//活动详情
	@RequestMapping(method = RequestMethod.GET,value="actions/actiondetail")
	public @ResponseBody Message actiondetail(int actionid){
		return courseService.selelctActiondetail(actionid);
	}
	
	//近期活动（得到最新所有活动）
	@RequestMapping(method = RequestMethod.GET,value="actions/newactions")
	public @ResponseBody Message actionNew(){
		return courseService.getAllNewActions();
	}
	
	//老年人取消参加某活动
	@RequestMapping(method = RequestMethod.POST,value="actions/cancelctions")
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
	 

}

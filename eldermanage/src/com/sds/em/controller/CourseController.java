package com.sds.em.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Video;
import com.sds.em.service.CourseService;

/**
 * 
 * @author 蔡文艳-2017-10-17 老人教育系统controller
 *
 */
@Controller
@RequestMapping("v1/course/")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	//返回所有课程  ----写完
	@RequestMapping(method=RequestMethod.GET, value = "classes")
	public @ResponseBody Message classes(){//所有的视频
		return courseService.allClasses();
	}
	
	//返回课程（视频）详细  ----写完
	@RequestMapping(method=RequestMethod.GET,value = "detail")
	public @ResponseBody Message classDetail(int videoId){
		return courseService.classDetail(videoId);
	}
	
	//添加老人观看课程（视频）记录表       ----写完
	@RequestMapping(method =RequestMethod.POST,value = "record" )
	public @ResponseBody Message insertRecord(HttpSession s,int videoid){
		int olderid=(int) s.getAttribute("olderid");
		return courseService.classRecord(olderid,videoid,new Date());
	}
	
	//返回当前讲座      ----写完
	@RequestMapping(method = RequestMethod.GET,value ="lecture")
	public @ResponseBody Message currentLecture(HttpSession s){
//		int olderid = 0;
//		s.setAttribute("olderid", olderid);
		
		int olderid=(int) s.getAttribute("olderid");
		int olderbranchid = (int) s.getAttribute("olderbranchid");
		return courseService.currentLecture(olderid,olderbranchid);
	}
	
	
	
	 
	//某老人报名讲座(参加讲座、将讲座已预约人数修改)   ----写完
	@RequestMapping(method = RequestMethod.POST,value="lecture/join")
	public @ResponseBody Message insertlectureRecord(HttpSession s,int lectureid){
		int olderid=(int) s.getAttribute("olderid");
		return courseService.joinLecture(olderid, lectureid);
	}
	
   //播放热度列表实现     ----写完 通过
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
	
	
	//老人查看自己的课程视频播放记录
	
}

package com.sds.em.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.CourseService;
/**
 * 
 * @author 蔡文艳-2017-10-17
 *
 */
@Controller
@RequestMapping("v1/course/")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	//返回所有课程
	@RequestMapping(method=RequestMethod.GET, value = "classes")
	public @ResponseBody Message classes(){//所有的视频
		return courseService.allClasses();
	}
	
//	//返回课程（视频）详细
//	@RequestMapping(method=RequestMethod.GET,value = "detail")
//	public @ResponseBody Message classDetail(int videoId){
//		return courseService.classDetail(videoId);
//	}
	
	//添加老人观看课程（视频）记录
	@RequestMapping(method =RequestMethod.POST,value="record" )
	public @ResponseBody Message insertRecord(String oldertoken,int videoid,Date vrecorddate){
		
		return courseService.classRecord(oldertoken,videoid,vrecorddate);
	}
	
	//返回当前讲座
	@RequestMapping(method = RequestMethod.GET,value="lecture")
	public @ResponseBody Message currentLecture(){
		return courseService.currentLecture();
	}
	
	//某老人报名讲座(参加讲座、讲座已预约人数修改)
	@RequestMapping(method = RequestMethod.POST,value="lecture/join")
	public @ResponseBody Message insertlectureRecord(@RequestBody String oldertoken,@RequestBody int lectureid){
		return courseService.joinLecture(oldertoken, lectureid);
	}
	
   //播放热度列表实现
	
	
}

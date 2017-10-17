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

@Controller
@RequestMapping("v1/course/")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	//���ؿγ�statusΪ1�����пγ�
	@RequestMapping(method=RequestMethod.GET, value = "class")
	public @ResponseBody Message classes(){//����statusΪ1����Ƶ
		return courseService.allClasses();
	}
	
	//���ؿγ̣���Ƶ����ϸ
	@RequestMapping(method=RequestMethod.GET,value = "detail")
	public @ResponseBody Message classDetail(int videoId){
		return courseService.classDetail(videoId);
	}
	
	//������˹ۿ��γ̣���Ƶ����¼
	@RequestMapping(method =RequestMethod.POST,value="record" )
	public @ResponseBody Message insertRecord(String olderToken,int videoId,Date vRecordDate,float vRecordCurrentDate){
		
		return courseService.classRecord(olderToken,videoId,vRecordDate,vRecordCurrentDate);
	}
	
	//���ص�ǰ����
	@RequestMapping(method = RequestMethod.GET,value="lecture")
	public @ResponseBody Message currentLecture(){
		return courseService.currentLecture();
	}
	
	//ĳ���˱�������
	@RequestMapping(method = RequestMethod.POST,value="lecture/join")
	public @ResponseBody Message insertlectureRecord(String olderToken,int lectureId){
		return courseService.joinLecture(olderToken, lectureId);
	}
	
	//
	
}

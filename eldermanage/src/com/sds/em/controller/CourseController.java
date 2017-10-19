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
 * @author ������-2017-10-17
 *
 */
@Controller
@RequestMapping("v1/course/")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	//�������пγ�
	@RequestMapping(method=RequestMethod.GET, value = "classes")
	public @ResponseBody Message classes(){//���е���Ƶ
		return courseService.allClasses();
	}
	
//	//���ؿγ̣���Ƶ����ϸ
//	@RequestMapping(method=RequestMethod.GET,value = "detail")
//	public @ResponseBody Message classDetail(int videoId){
//		return courseService.classDetail(videoId);
//	}
	
	//������˹ۿ��γ̣���Ƶ����¼
	@RequestMapping(method =RequestMethod.POST,value="record" )
	public @ResponseBody Message insertRecord(String oldertoken,int videoid,Date vrecorddate){
		
		return courseService.classRecord(oldertoken,videoid,vrecorddate);
	}
	
	//���ص�ǰ����
	@RequestMapping(method = RequestMethod.GET,value="lecture")
	public @ResponseBody Message currentLecture(){
		return courseService.currentLecture();
	}
	
	//ĳ���˱�������(�μӽ�����������ԤԼ�����޸�)
	@RequestMapping(method = RequestMethod.POST,value="lecture/join")
	public @ResponseBody Message insertlectureRecord(@RequestBody String oldertoken,@RequestBody int lectureid){
		return courseService.joinLecture(oldertoken, lectureid);
	}
	
   //�����ȶ��б�ʵ��
	
	
}

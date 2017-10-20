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
 * @author ������-2017-10-17 ���˽���ϵͳcontroller
 *
 */
@Controller
@RequestMapping("v1/course/")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	//�������пγ�  ----д��
	@RequestMapping(method=RequestMethod.GET, value = "classes")
	public @ResponseBody Message classes(){//���е���Ƶ
		return courseService.allClasses();
	}
	
	//���ؿγ̣���Ƶ����ϸ  ----д��
	@RequestMapping(method=RequestMethod.GET,value = "detail")
	public @ResponseBody Message classDetail(int videoId){
		return courseService.classDetail(videoId);
	}
	
	//������˹ۿ��γ̣���Ƶ����¼��       ----д��
	@RequestMapping(method =RequestMethod.POST,value = "record" )
	public @ResponseBody Message insertRecord(HttpSession s,int videoid){
		int olderid=(int) s.getAttribute("olderid");
		return courseService.classRecord(olderid,videoid,new Date());
	}
	
	//���ص�ǰ����      ----д��
	@RequestMapping(method = RequestMethod.GET,value ="lecture")
	public @ResponseBody Message currentLecture(HttpSession s){
//		int olderid = 0;
//		s.setAttribute("olderid", olderid);
		
		int olderid=(int) s.getAttribute("olderid");
		int olderbranchid = (int) s.getAttribute("olderbranchid");
		return courseService.currentLecture(olderid,olderbranchid);
	}
	
	
	
	 
	//ĳ���˱�������(�μӽ�������������ԤԼ�����޸�)   ----д��
	@RequestMapping(method = RequestMethod.POST,value="lecture/join")
	public @ResponseBody Message insertlectureRecord(HttpSession s,int lectureid){
		int olderid=(int) s.getAttribute("olderid");
		return courseService.joinLecture(olderid, lectureid);
	}
	
   //�����ȶ��б�ʵ��     ----д�� ͨ��
	@RequestMapping(method = RequestMethod.GET,value="video/heat")
	public @ResponseBody Message videoheat(){
		return courseService.videoHeatTop();
	}
	
	//�����γ�
	@RequestMapping(method = RequestMethod.POST,value = "video/publishment")
	public @ResponseBody Message publish(@RequestBody Video video){
		return courseService.publishVideos(video);
	}
	
	
	//��������
	@RequestMapping(method=RequestMethod.POST,value="lecture/publishment")
	public @ResponseBody Message publish(Lecture lecture){
		return courseService.publishLectures(lecture);
	}
	
	
	//���˲鿴�Լ��Ŀγ���Ƶ���ż�¼
	
}

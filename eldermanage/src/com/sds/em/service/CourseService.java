package com.sds.em.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Action;
import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Oldertoken;
import com.sds.em.po.Video;

/**
 * 
 * @author ������-2017-10-17
 *
 */
public interface CourseService {
	// ��ѯ���е���Ƶ(���ؿγ��б�)
	public Message allClasses();

	 //���ؿγ̣���Ƶ����ϸ
	 public Message classDetail(int videoId);

	// ������˹ۿ��γ̼�¼
	public Message classRecord(int olderid,int videoid,Date lrecorddate);

	// ����δ��¼ʱ�����н���
	public Message allLectureByolder(int olderid,int olderbranchid);
	// ����δ��¼������н���
	public Message allLectures();
	
	// ���˱�����������ӽ�����¼��/�޸�ԤԼ����+1��
	public Message joinLecture(int olderid, int lectureId);

  //�����ȶ��б�ʵ��
   public Message videoHeatTop();
	
   //�����γ�
   public Message publishVideos(Video video);
   //��������
   public Message publishLectures(Lecture lecture);
   
   //���˲鿴�Լ�����Ƶ���ż�¼
   public Message videoRecord(int olderid);
  
   
   //�����
 	public Message publishAction(Action actions);
 	//���˵�½�󿴵���Ƭ�����л
 	public Message allActionsByolder(int olderid,int olderbranchid);
 	//���л
	public Message allActions();
 	//���˲μӹ��Ļ
 	public Message olderActions(int olderid,int olderbranchid);
 	//������¼��
 	public Message joinAction(int olderid, int lectureid);
}

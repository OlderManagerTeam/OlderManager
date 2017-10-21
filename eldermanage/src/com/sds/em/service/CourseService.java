package com.sds.em.service;

import java.util.Date;

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

	// ���ص�ǰ����
	public Message currentLecture(int olderid,int olderbranchid);

	// ���˱�����������ӽ�����¼��/�޸�ԤԼ����+1��
	public Message joinLecture(int olderid, int lectureId);

  //�����ȶ��б�ʵ��
   public Message videoHeatTop();
	
   //�����γ�
   public Message publishVideos(Video video);
   //��������
   public Message publishLectures(Lecture lecture);
}

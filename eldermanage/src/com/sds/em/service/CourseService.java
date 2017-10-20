package com.sds.em.service;

import java.util.Date;

import com.sds.em.po.Message;

/**
 * 
 * @author ������-2017-10-17
 *
 */
public interface CourseService {
	// ��ѯ���е���Ƶ(���ؿγ��б�)
	public Message allClasses();

	// //���ؿγ̣���Ƶ����ϸ
	// public Message classDetail(int videoId);

	// ������˹ۿ��γ̼�¼
	public Message classRecord(String olderToken, int videoId, Date vRecordDate);

	// ���ص�ǰ����
	public Message currentLecture(int olderid,String olderbranchid);

	// ���˱�����������ӽ�����¼��/�޸�ԤԼ����+1��
	public Message joinLecture(int olderid, int lectureId);

  //�����ȶ��б�ʵ��
   public Message videoHeatTop();
	

}

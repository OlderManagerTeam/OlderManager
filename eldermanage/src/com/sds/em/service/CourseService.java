package com.sds.em.service;

import java.util.Date;

import com.sds.em.po.Message;

public interface CourseService {
	//��ѯ����statusΪ1����Ƶ(���ؿγ��б�)
	public Message allClasses();
	//���ؿγ̣���Ƶ����ϸ
	public Message classDetail(int videoId);
	//������˹ۿ��γ̼�¼
	public Message classRecord(String olderToken,int videoId,Date vRecordDate,float vRecordCurrentDate);
	//���ص�ǰ����
	public Message currentLecture();
	//���˱�����������ӽ�����¼��
	public Message joinLecture(String olderToken,int lectureId);
	//�鿴���ػ
	public Message localAction(String olderToken);
}

package com.sds.em.service;

import com.sds.em.po.Action;
import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.po.Visited;

public interface BrenchService {
	// ���˻�����Ϣ��¼��
	public Message addElderInfo(Olderbase olderbase) throws Exception;

	// ���˻�����Ϣ���޸�
	public Message modifyOlder(Olderbase olderbase) throws Exception;

	// ���˲�����Ϣ��¼��
	public Message addSicks(Oldersick oldersick) throws Exception;

	// ��������

	public Message olderRate(int olderId) throws Exception;

	// �����
	public Message publishAction(Action action) throws Exception;

	// �޸Ļ
	public Message modifyAction(Action action) throws Exception;

	// ��ѯ�������Ա���ڵķֵ���
	public Message getBranchName(int staffid) throws Exception;

	// ��ѯ���ֵ��������˵Ļ�����Ϣ
	public Message getAllElder(int branchid) throws Exception;

	//// ɾ��ĳ�����˵���Ϣ
	public Message deleteANElder(String oldertel) throws Exception;

	// ��ȡĳ�����˵���Ϣ
	public Message getElder(String oldertel) throws Exception;

	// �鿴�����˵����в�����Ϣ
	public Message getOlderAllSick(int olderid) throws Exception;

	// ɾ��һ�����˲�����Ϣ
	public Message deleteOlderSick(int sickid) throws Exception;

	// �鿴�����˵Ķ�����Ϣ
	public Message getOlderAllOrder(int olderid) throws Exception;

	// ����������ӻطü�¼
	public Message andOlderVisited(Visited visited) throws Exception;

	// �鿴�����˵����лطü�¼��Ϣ
	public Message getOlderAllVisited(int olderid) throws Exception;
	
	//��ӽ�����Ϣ
	public Message addLecture(Lecture lecture)throws Exception;
	
	public Message getLecture(int branchid)throws Exception;

}

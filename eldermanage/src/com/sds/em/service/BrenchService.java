package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;

public interface BrenchService {
	// ���˻�����Ϣ��¼��
	public Message addElderInfo(Olderbase olderbase) throws Exception;

	// ���˻�����Ϣ���޸�
	public Message modifyOlder(Olderbase olderbase);
	
	// ���˲�����Ϣ��¼��
	public Message addSicks(int sickOlderId, Oldersick oldersick) throws Exception;
}

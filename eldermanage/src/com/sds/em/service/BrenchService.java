package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;

public interface BrenchService {
	// 老人基本信息的录入
	public Message addElderInfo(Olderbase olderbase) throws Exception;

	// 老人基本信息的修改
	public Message modifyOlder(Olderbase olderbase) throws Exception;
	
	// 老人病历信息的录入
	public Message addSicks(int sickOlderId, Oldersick oldersick) throws Exception;
	
	/*//发布活动
	public Message publishAction() throws Exception;*/
}

package com.sds.em.service;

import com.sds.em.po.Message;

public interface IndexPersonalService {
	// 返回老人用户个人基本信息
	public Message getOlderInfo(int olderid);
	// 返回老人病例
	public Message getOlderSickInfo(int olderid);
	
}

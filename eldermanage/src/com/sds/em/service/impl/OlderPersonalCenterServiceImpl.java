package com.sds.em.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OldermessageMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Oldermessage;
import com.sds.em.po.OldermessageExample;
import com.sds.em.service.OlderPersonalCenterService;

public class OlderPersonalCenterServiceImpl implements OlderPersonalCenterService{
	
	@Autowired
	OldermessageMapper oldermessageMapper;
	OldermessageExample oldermessageExample=new OldermessageExample();
	OldermessageExample.Criteria oldermessageCriteria;
	@Override
	//未读消息返回
	public Message newmessagecount(int olderid) {
		return new Message(true,"未读消息返回",oldermessageMapper.newmessagecount(olderid));
	}
	@Override
	//消息全部已读
	public Message readallmessage(int olderid) {
		oldermessageExample.clear();
		oldermessageCriteria=oldermessageExample.createCriteria();
		oldermessageCriteria.andMessageolderidEqualTo(olderid);
		Oldermessage oldermessage=new Oldermessage();
		oldermessage.setMessagestatus("已读");
		oldermessageMapper.updateByExampleSelective(oldermessage, oldermessageExample);
		return new Message(true,"全部已读",null);
	}

	//消息单个已读
	@Override
	public Message readAmessage(int olderid, Long messageid) {
		Oldermessage oldermessage=new Oldermessage();
		oldermessage.setMessagestatus("已读");
		oldermessage.setMessageid(messageid);
		oldermessageMapper.updateByPrimaryKeySelective(oldermessage);
		return new Message(true,messageid+"已读",null);
	}
	@Override
	//已读消息返回
	public Message oldmessagecount(int olderid) {
		oldermessageExample.clear();
		oldermessageCriteria=oldermessageExample.createCriteria();
		oldermessageCriteria.andMessageolderidEqualTo(olderid);
		oldermessageCriteria.andMessagecontentEqualTo("已读");
		return new Message(true,"已读消息返回",oldermessageMapper.selectByExample(oldermessageExample));
	}
	@Override
	//单个消息详情
	public Message messagebyid(int olderid, Long oldermessageid) {
		oldermessageExample.clear();
		oldermessageCriteria=oldermessageExample.createCriteria();
		oldermessageCriteria.andMessageolderidEqualTo(olderid);
		oldermessageCriteria.andMessageidEqualTo(oldermessageid);
		return new Message(true,"单个消息详情",oldermessageMapper.selectByExample(oldermessageExample));
	}
	
	@Override
	//未评价回访
	public Message visited(int olderid) {
		// TODO 自动生成的方法存根
		return null;
	}
}

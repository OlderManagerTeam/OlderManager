package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.pojo.LoginMassage;
import com.sds.em.service.OlderPersonalCenterService;

@Controller
@RequestMapping("v1/olderpersonal/")
public class OlderPersonalCenterController {
	@Autowired
	OlderPersonalCenterService olderPersonalCenterService;
	// 老人未读消息
	@RequestMapping(method = RequestMethod.GET, value = "newmessagecount")
	public @ResponseBody Message classDetail(HttpSession s) {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false ,"未登录",null);
		} else {// 已登陆
			int olderid = loginMassage.getOlderid();
			return olderPersonalCenterService.newmessagecount(olderid);
		}
	}
	
	// 消息全部已读
	@RequestMapping(method = RequestMethod.GET, value = "readallmessage")
	public @ResponseBody Message readallmessage(HttpSession s) {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false ,"未登录",null);
		} else {// 已登陆
			int olderid = loginMassage.getOlderid();
			return olderPersonalCenterService.readallmessage(olderid);
		}
	}
	
	// 消息单个已读
	@RequestMapping(method = RequestMethod.GET, value = "readAmessage")
	public @ResponseBody Message readAmessage(HttpSession s,Long messageid) {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false ,"未登录",null);
		} else {// 已登陆
			int olderid = loginMassage.getOlderid();
			return olderPersonalCenterService.readAmessage(olderid,messageid);
		}
	}
	
	// 老人已读消息
	@RequestMapping(method = RequestMethod.GET, value = "oldmessagecount")
	public @ResponseBody Message oldmessagecount(HttpSession s) {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false ,"未登录",null);
		} else {// 已登陆
			int olderid = loginMassage.getOlderid();
			return olderPersonalCenterService.oldmessagecount(olderid);
		}
	}
	
	// 消息消息详情
	@RequestMapping(method = RequestMethod.GET, value = "messagebyid")
	public @ResponseBody Message messagebyid(HttpSession s,Long oldermessageid) {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false ,"未登录",null);
		} else {// 已登陆
			int olderid = loginMassage.getOlderid();
			return olderPersonalCenterService.messagebyid(olderid,oldermessageid);
		}
	}
	
	// 回访评价返回
	@RequestMapping(method = RequestMethod.GET, value = "visited")
	public @ResponseBody Message visited(HttpSession s) {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false ,"未登录",null);
		} else {// 已登陆
			int olderid = loginMassage.getOlderid();
			return olderPersonalCenterService.visited(olderid);
		}
	}
}
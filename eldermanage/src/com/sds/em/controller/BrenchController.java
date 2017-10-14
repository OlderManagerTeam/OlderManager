package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Action;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.service.BrenchService;

/*
 * 作者：刘露
 * 描述：分店管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/brench/")
public class BrenchController {
	@Autowired
	BrenchService brenchManageService;

	// 老人基本信息的录入
	@RequestMapping(method = RequestMethod.POST, value = "elder/info")
	public @ResponseBody Message info(Olderbase olderbase) throws Exception {
		return brenchManageService.addElderInfo(olderbase);

	}

	// 老人基本信息的修改
	@RequestMapping(method = RequestMethod.PUT, value = "elder/info")
	public @ResponseBody Message update(Olderbase olderbase) throws Exception {
		return brenchManageService.modifyOlder(olderbase);
	}

	// 老人病历信息的录入
	@RequestMapping(method = RequestMethod.POST, value = "elder/sicks")
	public @ResponseBody Message sicks(int sickOlderId, Oldersick oldersick) throws Exception {
		return brenchManageService.addSicks(sickOlderId, oldersick);
	}
	//老人评价
	@RequestMapping(method = RequestMethod.POST, value = "elder/rate")
	public @ResponseBody Message rate(int olderId) throws Exception {
		return brenchManageService.olderRate(olderId);
	}
	
	//发布活动
	@RequestMapping(method = RequestMethod.POST, value = "action")
	public @ResponseBody Message addAction(Action action) throws Exception {
		return brenchManageService.publishAction(action);
	}
	
	//修改活动
	
	@RequestMapping(method = RequestMethod.PUT, value = "action")
	public @ResponseBody Message updateAction(Action action) throws Exception {
		return brenchManageService.modifyAction(action);
	}
}

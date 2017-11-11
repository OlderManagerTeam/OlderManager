package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.ShopPersonalFrontService;

/*
 * 作者：刘露
 * 描述：电商管理系统-老人个人中心的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/shop/personal/")
public class ShopPersonalFrontController {
	@Autowired
	ShopPersonalFrontService shopPersonalFrontService;
	//显示电商老人的个人电商信息
	@RequestMapping(method = RequestMethod.POST, value = "older/info")
	public @ResponseBody Message shopPersonalInfo(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.shopPersonalInfo(olderid);
	}
}

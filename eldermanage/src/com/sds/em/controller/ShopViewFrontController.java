package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.ShopViewFrontService;

/*
 * 作者：刘露
 * 描述：电商管理系统-页面展示的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/older/shop/")
public class ShopViewFrontController {
	@Autowired
	ShopViewFrontService shopViewFrontService;
	//根据商品日销量进行 =今天推荐-只推荐最高的三个商品
	@RequestMapping(method = RequestMethod.POST, value = "index/today/recommend")
	public @ResponseBody Message todayRecommend() throws Exception {
		return shopViewFrontService.todayRecommend();
	}
}

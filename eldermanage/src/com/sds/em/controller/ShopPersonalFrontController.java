package com.sds.em.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.po.Productrate;
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

	// 显示电商老人的个人电商信息-全部成功
	@RequestMapping(method = RequestMethod.GET, value = "older/info")
	public @ResponseBody Message shopPersonalInfo(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.shopPersonalInfo(olderid);
	}

	// 显示我的订单页面-后端完成-全部成功
	@RequestMapping(method = RequestMethod.GET, value = "myorder/info")
	public @ResponseBody Message shopMyOrderInfo(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.shopMyOrderInfo(olderid);
	}

	// 显示购买记录页面-全部成功
	@RequestMapping(method = RequestMethod.GET, value = "buyrecord/info")
	public @ResponseBody Message shopBuyRecordInfo(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.shopBuyRecordInfo(olderid);
	}

	// 评价商品-全部成功
	@RequestMapping(method = RequestMethod.POST, value = "buyrecord/rate/add")
	public @ResponseBody Message AddRate(HttpSession session, String orderlistid, String ratestar, String ratecontent)
			throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		Productrate productrate = new Productrate();
		productrate.setRatecontent(ratecontent);
		productrate.setRatedate(new Date());
		productrate.setRateolderid(olderid);
		productrate.setRateorderid(Integer.parseInt(orderlistid));
		productrate.setRatestar(Integer.parseInt(ratestar));
		return shopPersonalFrontService.AddRate(productrate);
	}

	// 显示评价信息-全部成功
	@RequestMapping(method = RequestMethod.GET, value = "buyrecord/rate/info")
	public @ResponseBody Message RateInfo(int orderlistid) throws Exception {
		return shopPersonalFrontService.RateInfo(orderlistid);
	}

	// 老人确认收货-全部成功
	@RequestMapping(method = RequestMethod.GET, value = "myorder/sure")
	public @ResponseBody Message myOrderSure(HttpSession session, int orderid) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.myOrderSure(olderid, orderid);
	}

	// 老人申请取消订单-全部成功
	@RequestMapping(method = RequestMethod.GET, value = "myorder/apply/cancel")
	public @ResponseBody Message myOrderApplyCancel(HttpSession session, int orderid) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.myOrderApplyCancel(olderid, orderid);
	}
	
	//显示 我的团购页面
	@RequestMapping(method = RequestMethod.GET, value = "mygroups/info")
	public @ResponseBody Message myGroupsInfo(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.myGroupsInfo(olderid);
	}
   //显示我的足迹
	@RequestMapping(method = RequestMethod.GET, value = "myfootprint/info")
	public @ResponseBody Message myFootprintInfo(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPersonalFrontService.myFootprintInfo(olderid);
	}

}

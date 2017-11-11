package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.ShopPayFrontService;
import com.sds.em.shopfront.pojo.RightNowPayExtend;

/*
 * 作者：刘露
 * 描述：电商管理系统-老人购买的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/shop/pay/")
public class ShopPayFrontController {
	@Autowired
	ShopPayFrontService shopPayFrontService;

	// 第一次将商品加入购物车。不能加入第二次-后端成功
	@RequestMapping(method = RequestMethod.POST, value = "index/add/shopcart")
	public @ResponseBody Message addFirstShopcart(HttpSession session, int productid, int count) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.addFirstShopcart(olderid, productid, count);
	}

	// 从详情页面加入购物车-得判断之前有没有加入过-后端成功
	@RequestMapping(method = RequestMethod.POST, value = "add/shopcart")
	public @ResponseBody Message addShopcart(HttpSession session, int productid, int count) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.addShopcart(olderid, productid, count);
	}

	// 显示购物车页面-所加入的商品信息-老人积分信息-后端成功-全部完成
	@RequestMapping(method = RequestMethod.GET, value = "shopcart/view")
	public @ResponseBody Message ShopcartView(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.ShopcartView(olderid);
	}

	// 从购物车中删除一个商品-后端成功
	@RequestMapping(method = RequestMethod.DELETE, value = "shopcart/remove")
	public @ResponseBody Message cartProductRemove(HttpSession session, int productid) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.cartProductRemove(olderid, productid);
	}

	//
	// 立即购买-确认订单页面-全部完成
	@RequestMapping(method = RequestMethod.GET, value = "rightnow/confirm/order")
	public @ResponseBody Message confirmOrderRightNow(HttpSession session, int productid) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.confirmOrderRightNow(olderid, productid);
	}
	// 购物车结算-确认订单页面-全部完成
	@RequestMapping(method = RequestMethod.GET, value = "cart/confirm/order")
	public @ResponseBody Message confirmOrderCart(HttpSession session) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.confirmOrderCart(olderid);
	}
	//点击结算时，刷新购物车数据-后端成功
	@RequestMapping(method = RequestMethod.POST, value = "cart/confirm/order/sure")
	public @ResponseBody Message updateCart(HttpSession session,int[] productid,int[] count) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.updateCart(olderid, productid, count);
	}
	//生成订单表和订单详情表-后端成功
	@RequestMapping(method = RequestMethod.GET, value = "order/formation")
	public @ResponseBody Message orderFormation(HttpSession session,float ordertotal,int ordertakepoint) throws Exception {
		// int olderid=session.getAttribute("olderid");
		int olderid = 1;
		return shopPayFrontService.orderFormation(olderid, ordertotal, ordertakepoint);
	}
	
}

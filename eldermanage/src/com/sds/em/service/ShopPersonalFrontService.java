package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Productrate;

public interface ShopPersonalFrontService {
	// 显示电商老人的个人电商信息
	public Message shopPersonalInfo(int olderid) throws Exception;

	// 显示我的订单页面
	public Message shopMyOrderInfo(int olderid) throws Exception;

	// 显示购买记录页面
	public Message shopBuyRecordInfo(int olderid) throws Exception;

	// 评价商品
	public Message AddRate(Productrate productrate) throws Exception;

	// 显示评价信息
	public Message RateInfo(int rateid) throws Exception;

	// 老人确认收货
	public Message myOrderSure(int olderid,int orderid) throws Exception;

	// 老人申请取消订单
	public Message myOrderApplyCancel(int olderid,int orderid) throws Exception;
	
	//显示 我的团购页面
	public Message myGroupsInfo(int olderid) throws Exception;

	// 显示我的足迹
	public Message myFootprintInfo(int olderid) throws Exception;

}

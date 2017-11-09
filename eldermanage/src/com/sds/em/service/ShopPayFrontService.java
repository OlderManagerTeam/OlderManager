package com.sds.em.service;

import com.sds.em.po.Message;

public interface ShopPayFrontService {
	// 将商品加入购物车。不能加入第二次
	public Message addFirstShopcart(int olderid, int productid, int count);

	// 从详情页面加入购物车-得判断之前有没有加入过
	public Message addShopcart(int olderid, int productid, int count);

	// 从购物车中删除一个商品
	public Message cartProductRemove(int olderid, int productid);

	// 立即购买，显示购买页面详情
	public Message rightnowView(int olderid, int productid, int count);

	// 显示购物车页面-所加入的商品信息-老人积分信息
	public Message ShopcartView(int olderid);

}

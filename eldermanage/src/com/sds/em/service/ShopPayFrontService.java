package com.sds.em.service;

import com.sds.em.po.Message;

public interface ShopPayFrontService {
	// 将商品加入购物车。不能加入第二次
	public Message addFirstShopcart(int olderid, int productid, int count);

	// 从详情页面加入购物车-得判断之前有没有加入过
	public Message addShopcart(int olderid, int productid, int count);

	// 从购物车中删除一个商品
	public Message cartProductRemove(int olderid, int productid);

	// 立即购买-确认订单页面
	public Message confirmOrderRightNow(int olderid, int productid);

	// 购物车结算-确认订单页面
	public Message confirmOrderCart(int olderid);

	// 显示购物车页面-所加入的商品信息
	public Message ShopcartView(int olderid);

	// 点击结算时，刷新购物车数据
	public Message updateCart(int olderid, int[] productid, int[] count);

	// 生成订单表和订单详情表
	public Message orderFormation(int olderid, float ordertotal, int ordertakepoint);
}

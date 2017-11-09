package com.sds.em.shop.pojo;

import com.sds.em.po.Product;

//购物车页面的信息展示
public class CartViewExtend extends Product {

	private int cartcount;

	private float preferentialPrice;// 价格优惠

	public float getPreferentialPrice() {
		return preferentialPrice;
	}

	public void setPreferentialPrice(float preferentialPrice) {
		this.preferentialPrice = preferentialPrice;
	}

	public int getCartcount() {
		return cartcount;
	}

	public void setCartcount(int cartcount) {
		this.cartcount = cartcount;
	}

}

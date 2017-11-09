package com.sds.em.shop.pojo;

import com.sds.em.po.Product;

//老人确认订单页面信息
public class ConfirmOrderViewExtend extends Product {
	private int cartcount;

	private float preferentialPrice;// 价格优惠
	
	private String oldername;
	private String oldertel;
	private String olderaddress;
	private Integer olderpoint;
	public String getOldername() {
		return oldername;
	}
	public void setOldername(String oldername) {
		this.oldername = oldername;
	}
	public String getOldertel() {
		return oldertel;
	}
	public void setOldertel(String oldertel) {
		this.oldertel = oldertel;
	}
	public String getOlderaddress() {
		return olderaddress;
	}
	public void setOlderaddress(String olderaddress) {
		this.olderaddress = olderaddress;
	}
	public Integer getOlderpoint() {
		return olderpoint;
	}
	public void setOlderpoint(Integer olderpoint) {
		this.olderpoint = olderpoint;
	}
	public int getCartcount() {
		return cartcount;
	}
	public void setCartcount(int cartcount) {
		this.cartcount = cartcount;
	}
	public float getPreferentialPrice() {
		return preferentialPrice;
	}
	public void setPreferentialPrice(float preferentialPrice) {
		this.preferentialPrice = preferentialPrice;
	}

}

package com.sds.em.shop.pojo;

import java.util.Map;

import com.sds.em.po.Orders;

public class MyOrderViewExtend extends Orders {
	private Integer orderlistid;

	private Integer orderproductcount;

	private Float orderdiscountprice;

	private Integer productid;

	private String productname;

	private String productimg;

	private Float productdiscountprice;

	private Float productprice;

	private Map<Integer, String> ratestatus;// 购买记录中需要用的记录评价状态的

	public Map<Integer, String> getRatestatus() {
		return ratestatus;
	}

	public void setRatestatus(Map<Integer, String> ratestatus) {
		this.ratestatus = ratestatus;
	}

	public Integer getOrderlistid() {
		return orderlistid;
	}

	public void setOrderlistid(Integer orderlistid) {
		this.orderlistid = orderlistid;
	}

	public Integer getOrderproductcount() {
		return orderproductcount;
	}

	public void setOrderproductcount(Integer orderproductcount) {
		this.orderproductcount = orderproductcount;
	}

	public Float getOrderdiscountprice() {
		return orderdiscountprice;
	}

	public void setOrderdiscountprice(Float orderdiscountprice) {
		this.orderdiscountprice = orderdiscountprice;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductimg() {
		return productimg;
	}

	public void setProductimg(String productimg) {
		this.productimg = productimg;
	}

	public Float getProductdiscountprice() {
		return productdiscountprice;
	}

	public void setProductdiscountprice(Float productdiscountprice) {
		this.productdiscountprice = productdiscountprice;
	}

	public Float getProductprice() {
		return productprice;
	}

	public void setProductprice(Float productprice) {
		this.productprice = productprice;
	}

}

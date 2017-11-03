package com.sds.em.pojo;

import com.sds.em.po.Productrate;

public class ProductrateExtend extends Productrate{
	private String oldername;
	private String productname;
    private Integer producttypenumber;
    private String oldertel;
    private Integer orderid;
    private Integer productid;
    private Integer orderproductcount;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getOldername() {
		return oldername;
	}
	public void setOldername(String oldername) {
		this.oldername = oldername;
	}
	public Integer getProducttypenumber() {
		return producttypenumber;
	}
	public void setProducttypenumber(Integer producttypenumber) {
		this.producttypenumber = producttypenumber;
	}
	public String getOldertel() {
		return oldertel;
	}
	public void setOldertel(String oldertel) {
		this.oldertel = oldertel;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getOrderproductcount() {
		return orderproductcount;
	}
	public void setOrderproductcount(Integer orderproductcount) {
		this.orderproductcount = orderproductcount;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
}

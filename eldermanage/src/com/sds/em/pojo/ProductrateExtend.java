package com.sds.em.pojo;

import com.sds.em.po.Productrate;

public class ProductrateExtend extends Productrate{
	private String oldername;
	private String productname;
    private Integer producttypenumber;
    private String oldertel;
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
}

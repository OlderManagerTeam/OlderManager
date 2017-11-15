package com.sds.em.shop.pojo;

import java.util.Date;

import com.sds.em.po.Product;

public class MyFootFrintExtend extends Product {
	private Integer pviewocount;

	private Date pviewdate;

	public Integer getPviewocount() {
		return pviewocount;
	}

	public void setPviewocount(Integer pviewocount) {
		this.pviewocount = pviewocount;
	}

	public Date getPviewdate() {
		return pviewdate;
	}

	public void setPviewdate(Date pviewdate) {
		this.pviewdate = pviewdate;
	}

}

package com.sds.em.pojo;

import com.sds.em.po.Productgroup;

public class ProductgroupExtend extends Productgroup{
    private String productname;
    private Integer productid;
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}
}

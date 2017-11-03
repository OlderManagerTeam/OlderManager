package com.sds.em.pojo;

import com.sds.em.po.Orders;

public class OrdersExtend extends Orders{
    private String oldername;
    private String oldertel;
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
}

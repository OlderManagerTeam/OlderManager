package com.sds.em.service;

import com.sds.em.po.Message;

public interface ShopViewFrontService {
	//根据商品日销量进行 =今天推荐-只推荐最高的三个商品
	public Message todayRecommend() throws Exception;

}

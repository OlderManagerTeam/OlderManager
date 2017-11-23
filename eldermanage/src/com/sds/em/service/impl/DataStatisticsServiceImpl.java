package com.sds.em.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.JoingroupMapper;
import com.sds.em.mapper.ProductdaysaleMapper;
import com.sds.em.po.JoingroupExample;
import com.sds.em.po.Message;
import com.sds.em.po.ProductdaysaleExample;
import com.sds.em.service.DataStatisticsService;

public class DataStatisticsServiceImpl implements DataStatisticsService {
	@Autowired
	ProductdaysaleMapper productdaysaleMapper;
	ProductdaysaleExample productdaysaleExample = new ProductdaysaleExample();
	ProductdaysaleExample.Criteria productdaysaleCriteria;

	@Autowired
	JoingroupMapper joingroupMapper;
	JoingroupExample joingroupExample = new JoingroupExample();
	JoingroupExample.Criteria joingroupCriteria;
	@Override
	// 查询近10天商品浏览量和销售量
	public Message daysales() {
		return new Message(true, "返回成功", productdaysaleMapper.daysales());
	}

	@Override
	// 商城近十二月数据浏览量和销售量 wuwenbo
	public Message monthsales() {
		return new Message(true, "返回成功", productdaysaleMapper.monthsales());
	}

	@Override
	// 查看近10天团购信息
	public Message dayjoingroup() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", joingroupMapper.dayjoingroup());
	}

	@Override
	//获取近12月的团购数据
	public Message monthjoingroup() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", joingroupMapper.monthjoingroup());
	}

}

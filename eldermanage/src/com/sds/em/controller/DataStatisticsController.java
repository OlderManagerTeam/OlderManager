package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.DataStatisticsService;

/*
 * 作者：刘露
 * 描述：数据统计系统的相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/data/")
public class DataStatisticsController {
	@Autowired
	DataStatisticsService dataStatisticsService;

	// 商城近十日数据浏览量和销售量 wuwenbo
	@RequestMapping(method = RequestMethod.GET, value = "produtct/daysales")
	public @ResponseBody Message daysales() throws Exception {
		return dataStatisticsService.daysales();
	}

	// 商城近十二月数据浏览量和销售量 wuwenbo
	@RequestMapping(method = RequestMethod.GET, value = "produtct/monthsales")
	public @ResponseBody Message monthsales() throws Exception {
		return dataStatisticsService.monthsales();
	}

	// 查看近10天团购信息
	@RequestMapping(method = RequestMethod.GET, value = "produtct/dayjoingroup")
	public @ResponseBody Message dayjoingroup() throws Exception {
		return dataStatisticsService.dayjoingroup();
	}

	// 获取近12月的团购数据
	@RequestMapping(method = RequestMethod.GET, value = "produtct/monthjoingroup")
	public @ResponseBody Message monthjoingroup() throws Exception {
		return dataStatisticsService.monthjoingroup();
	}

	// wenbowu,分类查看库存
	@RequestMapping(method = RequestMethod.GET, value = "produtct/typestorecount")
	public @ResponseBody Message typestorecount() throws Exception {
		return dataStatisticsService.typestorecount();
	}
	
	// wuwenbo,近三十天商城商品类别销售数据
	@RequestMapping(method = RequestMethod.GET, value = "produtct/typesales")
	public @ResponseBody Message typesales() throws Exception {
		return dataStatisticsService.typesales();
	}
}

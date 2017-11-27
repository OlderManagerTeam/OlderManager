package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.po.Productrate;
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
	public @ResponseBody Message daysales(@RequestParam(value = "productid", required = false)Integer productid) throws Exception {
		if(productid==null)
			productid=0;
		return dataStatisticsService.daysales(productid);
	}

	// 商城近十二月数据浏览量和销售量 wuwenbo
	@RequestMapping(method = RequestMethod.GET, value = "produtct/monthsales")
	public @ResponseBody Message monthsales(@RequestParam(value = "productid", required = false)Integer productid) throws Exception {
		if(productid==null)
			productid=0;
		return dataStatisticsService.monthsales(productid);
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
	
	// wuwenbo,获取近10天商城评价
	@RequestMapping(method = RequestMethod.GET, value = "produtct/daysrate")
	public @ResponseBody Message typesales(Productrate pr,@RequestParam(value = "productid", required = false)Integer productid) throws Exception {
		if(productid==null)
			productid=0;
		return dataStatisticsService.daysrate(pr, productid);
	}
	
	//获取排名前十的分店的老人数量
	@RequestMapping(method = RequestMethod.GET, value = "branch/oldercount")
	public @ResponseBody Message brancholdercount() throws Exception {
		return dataStatisticsService.brancholdercount();
	}
	
	//获取排名前十的分店kpi
	@RequestMapping(method = RequestMethod.GET, value = "branch/KPI")
	public @ResponseBody Message branchKPI() throws Exception {
		return dataStatisticsService.branchKPI();
	}
	
	//获取近一个月排名前十的分店活动数量
	@RequestMapping(method = RequestMethod.GET, value = "branch/branchactioncount")
	public @ResponseBody Message branchactioncount() throws Exception {
		return dataStatisticsService.branchactioncount();
	}
	
	//获取近一个月讲座活动参加统计
	@RequestMapping(method = RequestMethod.GET, value = "branch/branchactionjoin")
	public @ResponseBody Message branchactionjoin() throws Exception {
		return dataStatisticsService.branchactionjoin();
	}
	
	//近三十天回访数量统计
	@RequestMapping(method = RequestMethod.GET, value = "branch/branchvisit")
	public @ResponseBody Message branchvisit() throws Exception {
		return dataStatisticsService.branchvisit();
	}
	
	//用户等级统计
	@RequestMapping(method = RequestMethod.GET, value = "branch/brancholderlevel")
	public @ResponseBody Message brancholderlevel() throws Exception {
		return dataStatisticsService.brancholderlevel();
	}
	
	//一周视频上传时长
	@RequestMapping(method = RequestMethod.GET, value = "video/weekvediotime")
	public @ResponseBody Message weekvediotime() throws Exception {
		return dataStatisticsService.weekvediotime();
	}
	
	//一周最热视频
	@RequestMapping(method = RequestMethod.GET, value = "video/weekheatvedio")
	public @ResponseBody Message weekheatvedio() throws Exception {
		return dataStatisticsService.weekheatvedio();
	}
	
	//一周上传视频情况
	@RequestMapping(method = RequestMethod.GET, value = "video/weekaddvedio")
	public @ResponseBody Message weekaddvedio() throws Exception {
		return dataStatisticsService.weekaddvedio();
	}
	
	//一周上收藏最多
	@RequestMapping(method = RequestMethod.GET, value = "video/weekvediocolle")
	public @ResponseBody Message weekvediocolle() throws Exception {
		return dataStatisticsService.weekvediocolle();
	}
	
	// 一周访视频问量
	@RequestMapping(method = RequestMethod.GET, value = "video/weekvedioview")
	public @ResponseBody Message weekvedioview() throws Exception {
		return dataStatisticsService.weekvedioview();
	}
	
	// 一周新闻访问量
	@RequestMapping(method = RequestMethod.GET, value = "news/weeknewsview")
	public @ResponseBody Message weeknewsview() throws Exception {
		return dataStatisticsService.weeknewsview();
	}
	
	// 一周新闻上传情况
	@RequestMapping(method = RequestMethod.GET, value = "news/weekaddnews")
	public @ResponseBody Message weekaddnews() throws Exception {
		return dataStatisticsService.weekaddnews();
	}
	
	// 一周新闻热度前十
	@RequestMapping(method = RequestMethod.GET, value = "news/weeknewsheat")
	public @ResponseBody Message weeknewsheat() throws Exception {
		return dataStatisticsService.weeknewsheat();
	}
}

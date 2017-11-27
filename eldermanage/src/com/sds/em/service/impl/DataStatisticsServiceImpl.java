package com.sds.em.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.JoingroupMapper;
import com.sds.em.mapper.NewsMapper;
import com.sds.em.mapper.OrdersMapper;
import com.sds.em.mapper.ProductdaysaleMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.mapper.ProductstoreMapper;
import com.sds.em.mapper.VideoMapper;
import com.sds.em.po.JoingroupExample;
import com.sds.em.po.Message;
import com.sds.em.po.Product;
import com.sds.em.po.ProductdaysaleExample;
import com.sds.em.po.Productrate;
import com.sds.em.po.ProductstoreExample;
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
	
	@Autowired
	OrdersMapper ordersMapper;
	
	@Autowired
	ProductstoreMapper productstoreMapper;
	ProductstoreExample productstoreExample = new ProductstoreExample();
	ProductstoreExample.Criteria productstoreCriteria;
	
	@Autowired
	ProductrateMapper productrateMapper;
	
	@Autowired
	BranchMapper branchMapper;
	
	@Autowired
	VideoMapper videoMapper;
	
	@Autowired
	NewsMapper newsMapper;
	@Override
	// 查询近10天商品浏览量和销售量
	public Message daysales(int productid) {
		Product product=new Product();
		product.setProductid(productid);
		return new Message(true, "返回成功", productdaysaleMapper.daysales(product));
	}

	@Override
	// 商城近十二月数据浏览量和销售量 wuwenbo
	public Message monthsales(int productid) {
		Product product=new Product();
		product.setProductid(productid);
		return new Message(true, "返回成功", productdaysaleMapper.monthsales(product));
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

	//wenbowu,分类查看库存
	@Override
	public Message typestorecount() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", productstoreMapper.typestorecount());
	}
	
	//wuwenbo,近三十天商城商品类别销售数据
	@Override
	public Message typesales() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", ordersMapper.typesales());
	}
	
	//获取近10天商城评价
	@Override
	public Message daysrate(Productrate pr,int productid) {
		pr.setRatestar(productid);
		return new Message(true, "返回成功", productrateMapper.daysrate(pr));
	}
	
	//获取排名前十的分店的老人数量
	@Override
	public Message brancholdercount() {
		return new Message(true, "返回成功", branchMapper.brancholdercount());
	}

	@Override
	//获取排名前十的分店kpi
	public Message branchKPI() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", branchMapper.branchKPI());
	}

	@Override
	//获取近一个月排名前十的分店活动数量
	public Message branchactioncount() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", branchMapper.branchactioncount());
	}

	@Override
	//获取近一个月讲座活动参加统计
	public Message branchactionjoin() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", branchMapper.branchactionjoin());
	}

	@Override
	//近三十天回访数量统计
	public Message branchvisit() {
		return new Message(true, "返回成功", branchMapper.branchvisit());
	}

	@Override
	//用户等级统计
	public Message brancholderlevel() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", branchMapper.brancholderlevel());
	}

	@Override
	//一周视频上传时长
	public Message weekvediotime() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", videoMapper.weekvediotime());
	}

	@Override
	//一周最热视频
	public Message weekheatvedio() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", videoMapper.weekheatvedio());
	}

	@Override
	//一周上传视频情况
	public Message weekaddvedio() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", videoMapper.weekaddvedio());
	}
	//一周上收藏最多
	@Override
	public Message weekvediocolle() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", videoMapper.weekvediocolle());
	}
	// 一周访问量
	@Override
	public Message weekvedioview() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", videoMapper.weekvedioview());
	}
	// 一周新闻访问量
	@Override
	public Message weeknewsview() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", newsMapper.weeknewsview());
	}
	// 一周新闻上传情况
	@Override
	public Message weekaddnews() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", newsMapper.weekaddnews());
	}
	// 一周新闻热度前十
	@Override
	public Message weeknewsheat() {
		// TODO 自动生成的方法存根
		return new Message(true, "返回成功", newsMapper.weeknewsheat());
	}
}

package com.sds.em.service;

import com.sds.em.po.Message;

public interface NewsFrontService {

	// 显示知识普及新闻-按照发布时间排序
	public Message CommonNewsView() throws Exception;

	// 显示健康养生新闻-按照发布时间排序
	public Message healthNewsView() throws Exception;

	// 不论两类，按照访问量进行排序的热门新闻
	public Message heatNewsView() throws Exception;
	
	//最新的两类新闻，按照时间排序
	public Message NewsView() throws Exception;
	
	//显示 一个新闻的详情
	public Message NewsInfo(int newsid) throws Exception;
	
	
}

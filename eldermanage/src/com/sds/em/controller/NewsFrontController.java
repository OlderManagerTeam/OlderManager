package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.NewsFrontService;

/*
 * 作者：刘露
 * 描述：新闻官网的前台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/front/news/")
public class NewsFrontController {
	@Autowired
	NewsFrontService newsFrontService;

	// 显示知识普及新闻-按照发布时间排序

	@RequestMapping(method = RequestMethod.GET, value = "common")
	public @ResponseBody Message CommonNewsView() throws Exception {
		return newsFrontService.CommonNewsView();
	}
	// 显示健康养生新闻-按照发布时间排序

	@RequestMapping(method = RequestMethod.GET, value = "health")
	public @ResponseBody Message healthNewsView() throws Exception {
		return newsFrontService.healthNewsView();
	}
	// 不论两类，按照访问量进行排序的热门新闻

	@RequestMapping(method = RequestMethod.GET, value = "heat")
	public @ResponseBody Message heatNewsView() throws Exception {
		return newsFrontService.heatNewsView();
	}

}

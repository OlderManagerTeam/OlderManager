package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.HealthyNewsFrontService;

/*
 *  进入“健康养生”模块
 */
@Controller
@RequestMapping("v1/healthynews")
public class HealthyNewsFrontController {
	
	@Autowired
	HealthyNewsFrontService healthyNewsFrontService;

	//显示所有未登录时的新闻
	@RequestMapping(method=RequestMethod.GET,value="allnews")
	public @ResponseBody Message allHealthyNews(String newstype){
		return healthyNewsFrontService.getAllHealthyNews(newstype);
	}
	//显示所有登录后的新闻
	@RequestMapping(method=RequestMethod.GET,value="allnewsbyolder")
	public @ResponseBody Message allHealthyNewsByOlder(HttpSession s){
		int olderid = (int) s.getAttribute("olderid");
		return healthyNewsFrontService.getAllHealthyNewsByOlder(olderid);
		
	}
}

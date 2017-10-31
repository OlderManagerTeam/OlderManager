package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.po.News;
import com.sds.em.po.Olderbase;
import com.sds.em.service.NewsService;
/*
 * 作者：刘露
 * 描述：健康养身-新闻管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/news/")
public class NewsController {
	@Autowired
	NewsService newsService;

	// 发布新闻--测试通过
	@RequestMapping(method = RequestMethod.POST, value = "news/publish")
	public @ResponseBody Message publish(@RequestBody News news) throws Exception {
		return newsService.publishNews(news);
	}

	// 查看已发布新闻--测试通过
	@RequestMapping(method = RequestMethod.GET, value = "news/published")
	public @ResponseBody Message published(String newstype) throws Exception {
		return newsService.publishedNews(newstype);
	}

	// 查看新闻详情--测试通过
	@RequestMapping(method = RequestMethod.GET, value = "news/detail")
	public @ResponseBody Message detail( int newsid) throws Exception {
		return newsService.newsDetail(newsid);
	}

	// 删除新闻-测试通过
	@RequestMapping(method = RequestMethod.DELETE, value = "news/{newsid}")
	public @ResponseBody Message delete(@RequestBody int newsid) throws Exception {
		return newsService.deleteNews(newsid);
	}
}

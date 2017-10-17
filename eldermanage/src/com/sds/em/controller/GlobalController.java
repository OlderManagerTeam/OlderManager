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
 * 
 * ��¶-2017-10-16
 */
@Controller
@RequestMapping("v1/")
public class GlobalController {
	@Autowired
	NewsService newsService;

	// ��������--����ͨ��
	@RequestMapping(method = RequestMethod.POST, value = "news/publish")
	public @ResponseBody Message publish(@RequestBody News news) throws Exception {
		return newsService.publishNews(news);
	}

	// �鿴�ѷ�������--����ͨ��
	@RequestMapping(method = RequestMethod.GET, value = "news/published")
	public @ResponseBody Message published(String newstype) throws Exception {
		return newsService.publishedNews(newstype);
	}

	// �鿴��������--����ͨ��
	@RequestMapping(method = RequestMethod.GET, value = "news/detail")
	public @ResponseBody Message detail( int newsid) throws Exception {
		return newsService.newsDetail(newsid);
	}

	// ɾ������-����ͨ��
	@RequestMapping(method = RequestMethod.DELETE, value = "news/{newsid}")
	public @ResponseBody Message delete(@RequestBody int newsid) throws Exception {
		return newsService.deleteNews(newsid);
	}
}

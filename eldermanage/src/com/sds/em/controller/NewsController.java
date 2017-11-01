package com.sds.em.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Message;
import com.sds.em.po.News;
import com.sds.em.po.Olderbase;
import com.sds.em.service.NewsService;
import com.sds.em.util.DateSimp;

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

	// 发布新闻--所有完成
	@RequestMapping(method = RequestMethod.POST, value = "publish")
	public @ResponseBody Message publish(HttpSession session, String newstitle, String newstype, String newseditorid,
			String newsissueddate, String newsintro, MultipartFile newsimg, String content) throws Exception {
		// int staffid=session.getAttribute("staffid");
		int staffid = 1;

		String pic_path = "E:\\oldermanageresource\\newsimg\\";
		String picUrl = "http://localhost:8080/newsimg/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";

		File dnf1 = new File(pic_path + newFileName);
		newsimg.transferTo(dnf1);

		News news = new News();
		news.setNewseditorid(staffid);
		news.setNewsheat(0);
		news.setNewsintro(newsintro);
		news.setNewstitle(newstitle);
		news.setNewstype(newstype);
		Date date = DateSimp.simp(newsissueddate);
		news.setNewsissueddate(date);
		news.setNewscontent(content);

		news.setNewsimg(picUrl + newFileName);
		return newsService.publishNews(news);
	}

	// 查看已发布新闻--所有完成
	@RequestMapping(method = RequestMethod.GET, value = "published")
	public @ResponseBody Message published() throws Exception {
		return newsService.publishedNews();
	}

	// 查看新闻详情--所有完成
	@RequestMapping(method = RequestMethod.GET, value = "detail")
	public @ResponseBody Message detail(int newsid) throws Exception {
		return newsService.newsDetail(newsid);
	}

	// 删除新闻-测试通过
	@RequestMapping(method = RequestMethod.DELETE, value = "info")
	public @ResponseBody Message delete( int newsid) throws Exception {
		return newsService.deleteNews(newsid);
	}
}

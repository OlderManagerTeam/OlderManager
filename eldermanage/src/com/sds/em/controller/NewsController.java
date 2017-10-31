package com.sds.em.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

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
	
/*	@RequestMapping(value = "uploadImg")
	@ResponseBody
	public String uploadImg(@RequestParam MultipartFile file, HttpServletRequest request) {
		UpLoadFile upLoadFile = new UpLoadFile();

		
		List<String> list = new ArrayList<String>();
		String pic_path = "E:\\develop\\upload\\temp\\pic\\newsPic\\";
		String picUrl = "http://localhost:8080/pic/newsPic/";
	//	String path = request.getSession().getServletContext().getRealPath(realPath);
		
		String name = file.getOriginalFilename();
		String pix = name.substring(name.lastIndexOf("."));
		String fileName = new Date().getTime() + pix;
		
		list.add(picUrl + fileName);
		upLoadFile.setData(list);
		File file1 = new File(pic_path + fileName);
		if (!file1.exists()) {
			file1.mkdirs();
		}
		try {
			file.transferTo(file1);
			upLoadFile.setErrno(0);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject jsonObject = JSONObject.fromObject(upLoadFile);
		String img=	jsonObject.toString();
		return img;
	}*/

	// 发布新闻
	@RequestMapping(method = RequestMethod.POST, value = "publish")
	public @ResponseBody Message publish(String content) throws Exception {
		News news = new News();
		news.setNewscontent(content);
		return newsService.publishNews(news);
	}

	// 查看已发布新闻--测试通过
	@RequestMapping(method = RequestMethod.GET, value = "published")
	public @ResponseBody Message published(String newstype) throws Exception {
		return newsService.publishedNews(newstype);
	}

	// 查看新闻详情--测试通过
	@RequestMapping(method = RequestMethod.GET, value = "news/detail")
	public @ResponseBody Message detail(int newsid) throws Exception {
		return newsService.newsDetail(newsid);
	}

	// 删除新闻-测试通过
	@RequestMapping(method = RequestMethod.DELETE, value = "{newsid}")
	public @ResponseBody Message delete(@RequestBody int newsid) throws Exception {
		return newsService.deleteNews(newsid);
	}
}

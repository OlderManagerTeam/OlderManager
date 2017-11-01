package com.sds.em.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Video;
import com.sds.em.service.VideoService;
import com.sds.em.util.DateSimp;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;

/*
 * 作者：刘露
 * 描述：视频管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/video/")
public class VideoController {
	@Autowired
	VideoService videoService;

	// 发布视频
	@RequestMapping(method = RequestMethod.POST, value = "info")
	public @ResponseBody Message entry(HttpSession session, String videoname, String videointro, String videodetail,
			String videopublishdate, String videopartition, MultipartFile videopicurl, MultipartFile videourl)
			throws Exception {
		// int olderbranchid=session.getAttribute("branchid");


		Video video = new Video();
		video.setVideodetail(videodetail);

		video.setVideoheat(0);
		video.setVideointro(videointro);
		video.setVideoname(videoname);
		video.setVideopartition(videopartition);
		Date date = DateSimp.simp(videopublishdate);
		video.setVideopublishdate(date);

		String pic_path = "E:\\oldermanageresource\\videoimg\\";
		String picUrl = "http://localhost:8080/videoimg/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
		// 缩略图
		File pic = new File(pic_path + newFileName);
		videopicurl.transferTo(pic);
		// 视频
		String video_path = "E:\\oldermanageresource\\videourl\\";
		String videoUrl =  "http://localhost:8080/videourl/";
		String newVideoFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".mp4";

		File vid = new File(video_path + newVideoFileName);
		videourl.transferTo(vid);
		// 获取视频的时长
		Encoder encoder = new Encoder();

		MultimediaInfo m = encoder.getInfo(vid);
		long ls = m.getDuration();
		// System.out.println("此视频时长为:" + ls / 60000 + "分" + (ls) / 1000 +
		// "秒！");
		video.setVideotime(ls / 60000 + "分钟");
		video.setVideopicurl(picUrl + newFileName);
		video.setVideourl(videoUrl + newVideoFileName);
		return videoService.entry(video);

	}

	// 显示所有的视频
	@RequestMapping(method = RequestMethod.GET, value = "allvideos")
	public @ResponseBody Message getAllVideos() throws Exception {

		return videoService.getAllVideos();

	}

	// 显示一个视频的详细信息
	@RequestMapping(method = RequestMethod.GET, value = "video")
	public @ResponseBody Message getAllVideos(int videoid) throws Exception {

		return videoService.getVideo(videoid);

	}

	// 修改视频信息
	@RequestMapping(method = RequestMethod.POST, value = "updatevideo")
	public @ResponseBody Message alter(HttpSession session, int videoid, String videoname, String videointro,
			String videodetail, String videopublishdate, String videopartition, MultipartFile videopicurl,
			MultipartFile videourl) throws Exception {
		// int olderbranchid=session.getAttribute("branchid");
		// 缩略图
		Video video=(Video) videoService.getVideo(videoid).getData();
		if(!videopicurl.isEmpty()){
			String picname[]=video.getVideopicurl().split("/");
			String pic_path = "E:\\oldermanageresource\\videoimg\\";
			File videopic=new File(pic_path+picname[picname.length-1]);
			if(videopic.exists())
				videopic.delete();
		}
		String pic_path = "E:\\oldermanageresource\\videoimg\\";
		String picUrl = "http://localhost:8080/videoimg/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";

		File pic = new File(pic_path + newFileName);
		videopicurl.transferTo(pic);
		// 视频
		if(!videourl.isEmpty()){
			String picname[]=video.getVideourl().split("/");
			String videoUrl = "E:\\oldermanageresource\\videourl\\";
			File video1=new File(videoUrl+picname[picname.length-1]);
			if(video1.exists())
				video1.delete();
		}
		
		String video_path = "E:\\oldermanageresource\\videourl\\";
		String videoUrl =  "http://localhost:8080/videourl/";
		String newVideoFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".mp4";

		File vid = new File(video_path + newVideoFileName);
		videourl.transferTo(vid);
		Video videonew = new Video();
		// 获取视频的时长
		Encoder encoder = new Encoder();

		MultimediaInfo m = encoder.getInfo(vid);
		long ls = m.getDuration();
		// System.out.println("此视频时长为:" + ls / 60000 + "分" + (ls) / 1000 +
		// "秒！");
		videonew.setVideotime(ls / 60000 + "分钟");
		
		videonew.setVideoid(videoid);
		videonew.setVideodetail(videodetail);
		videonew.setVideointro(videointro);
		videonew.setVideoname(videoname);
		videonew.setVideopartition(videopartition);
		Date date = DateSimp.simp(videopublishdate);
		videonew.setVideopublishdate(date);

		videonew.setVideopicurl(picUrl + newFileName);
		videonew.setVideourl(videoUrl + newVideoFileName);

		return videoService.alter(videonew);

	}

}

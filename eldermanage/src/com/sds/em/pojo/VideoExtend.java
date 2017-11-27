package com.sds.em.pojo;

import java.util.Date;

import com.sds.em.po.Video;

public class VideoExtend {
	private Video video;
	private Date vrecorddate;
	private String collectionStatue;
	private Date videocolledate;
	
	public Date getVideocolledate() {
		return videocolledate;
	}
	public void setVideocolledate(Date videocolledate) {
		this.videocolledate = videocolledate;
	}
	public String getCollectionStatue() {
		return collectionStatue;
	}
	public void setCollectionStatue(String collectionStatue) {
		this.collectionStatue = collectionStatue;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Date getVrecorddate() {
		return vrecorddate;
	}
	public void setVrecorddate(Date vrecorddate) {
		this.vrecorddate = vrecorddate;
	}
	

}

package com.sds.em.pojo;

import java.util.List;

import net.sf.json.JSONObject;
public class UpLoadFile {
	private int Errno;
	
	private List<String> Data;


	public List<String> getData() {
		return Data;
	}

	public void setData(List<String> data) {
		Data = data;
	}

	public int getErrno() {
		return Errno;
	}

	public void setErrno(int errno) {
		Errno = errno;
	}
	
	public String toJson(){
		JSONObject jsonObject = JSONObject.fromObject(this);
		String img=	jsonObject.toString();
		return img;
	}
}

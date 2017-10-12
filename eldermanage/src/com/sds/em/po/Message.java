package com.sds.em.po;
/**
 * 
 * @author wenbowu
 *信息传输类，把数据打包传输到前端
 */
public class Message {
	private boolean success;
	private String information;
	private Object data;

	public Message() {

	}

	public Message(boolean success,String information,Object data) {
		this.success=success;
		this.information=information;
		this.data=data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}

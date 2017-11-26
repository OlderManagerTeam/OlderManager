package com.sds.em.pojo;

import java.util.Date;

import com.sds.em.po.Action;

public class ActionExtend {
	
	private Action action;
	private String jionStatuString;
	private String startDateString;
	private Date arecorddate;
	
	
	public Date getArecorddate() {
		return arecorddate;
	}
	public void setArecorddate(Date arecorddate) {
		this.arecorddate = arecorddate;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public String getJionStatuString() {
		return jionStatuString;
	}
	public void setJionStatuString(String jionStatuString) {
		this.jionStatuString = jionStatuString;
	}
	public String getStartDateString() {
		return startDateString;
	}
	public void setStartDateString(String startDateString) {
		this.startDateString = startDateString;
	}


}

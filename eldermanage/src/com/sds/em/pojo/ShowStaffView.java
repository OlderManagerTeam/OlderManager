package com.sds.em.pojo;

import com.sds.em.po.Staffbase;

public class ShowStaffView extends Staffbase{
	
	private String departmentname;
	
	private String rolecontent;

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getRolecontent() {
		return rolecontent;
	}

	public void setRolecontent(String rolecontent) {
		this.rolecontent = rolecontent;
	}

}

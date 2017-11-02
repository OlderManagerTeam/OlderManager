package com.sds.em.shop.pojo;

import com.sds.em.po.Product;

public class productGradeExtend {

	private String percent;// 百分比
	private int totalRate;

	private int highRate;

	private int mediumRate;

	private int badRate;

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	public int getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(int totalRate) {
		this.totalRate = totalRate;
	}

	public int getHighRate() {
		return highRate;
	}

	public void setHighRate(int highRate) {
		this.highRate = highRate;
	}

	public int getMediumRate() {
		return mediumRate;
	}

	public void setMediumRate(int mediumRate) {
		this.mediumRate = mediumRate;
	}

	public int getBadRate() {
		return badRate;
	}

	public void setBadRate(int badRate) {
		this.badRate = badRate;
	}

}

package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Productrate;

public interface DataStatisticsService {
	public Message daysales();

	public Message monthsales();

	public Message dayjoingroup();

	public Message monthjoingroup();

	public Message typestorecount();

	public Message typesales();

	public Message daysrate(Productrate pr);
}

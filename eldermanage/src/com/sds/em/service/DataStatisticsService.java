package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Productrate;

public interface DataStatisticsService {
	public Message daysales(int productid);

	public Message monthsales(int productid);

	public Message dayjoingroup();

	public Message monthjoingroup();

	public Message typestorecount();

	public Message typesales();

	public Message daysrate(Productrate pr,int productid);
	
	public Message brancholdercount();

	public Message branchKPI();

	public Message branchactioncount();

	public Message branchactionjoin();

	public Message branchvisit();

	public Message brancholderlevel();

	public Message weekvediotime();

	public Message weekheatvedio();

	public Message weekaddvedio();

	public Message weekvediocolle();

	public Message weekvedioview();

	public Message weeknewsview();

	public Message weekaddnews();

	public Message weeknewsheat();
}

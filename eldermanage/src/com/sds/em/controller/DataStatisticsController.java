package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.po.Oldersick;
import com.sds.em.service.DataStatisticsService;
import com.sds.em.util.DateSimp;

/*
 * 作者：刘露
 * 描述：数据统计系统的相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/data/")
public class DataStatisticsController {
	@Autowired
	DataStatisticsService dataStatisticsService;

}

package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.pojo.LoginMassage;
import com.sds.em.service.IndexPersonalService;

/**
 * “首页个人中心”模块
 * @author 蔡文艳-2017-10-17 首页个人中心controller
 *
 */
@Controller
@RequestMapping("v1/indexpersonal/")
public class IndexPersonalFrontController {

	@Autowired 
	IndexPersonalService indexPersonalService;
	
	// 返回老人用户个人基本信息
	@RequestMapping(method=RequestMethod.GET, value = "olderbase")
		public @ResponseBody Message getOlderBase(HttpSession s){
			LoginMassage loginMassage = null;
			loginMassage = (LoginMassage) s.getAttribute("loginMassage");
			if (loginMassage == null) {//未登录
				return new Message(false,"未登录",null);
			}else{//已登陆
				int olderid = loginMassage.getOlderid();
			    return indexPersonalService.getOlderInfo(olderid);
			}
	}
	
	// 返回老人病例
	@RequestMapping(method=RequestMethod.GET, value = "oldersick")
	public @ResponseBody Message getOlderSickRecord(HttpSession s){
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) s.getAttribute("loginMassage");
		if (loginMassage == null) {//未登录
			return new Message(false,"未登录",null);
		}else{//已登陆
			int olderid = loginMassage.getOlderid();
		    return indexPersonalService.getOlderSickInfo(olderid);
		}
    }
	
	// 返回老人病例
}

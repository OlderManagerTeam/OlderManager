package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.ShopViewFrontService;

/*
 * 作者：刘露
 * 描述：电商管理系统-页面展示的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/older/shop/")
public class ShopViewFrontController {
	@Autowired
	ShopViewFrontService shopViewFrontService;

	// 根据商品日销量进行 =今天推荐-前端只取前三个商品-后端成功-所有成功
	@RequestMapping(method = RequestMethod.GET, value = "index/today/recommend")
	public @ResponseBody Message todayRecommend() throws Exception {
		return shopViewFrontService.todayRecommend();
	}

	// 每一种类按照月销量 前端只取前6个商品推荐（商品缩略图和价格）-后端成功-所有成功
	@RequestMapping(method = RequestMethod.GET, value = "index/type/recommend")
	public @ResponseBody Message typeRecommend(String typecontent) throws Exception {
		return shopViewFrontService.typeRecommend(typecontent);
	}

	// 搜索商品及量，只跟商品名字和商品信息进行匹配--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/search")
	public @ResponseBody Message productSearch(String info) throws Exception {
		return shopViewFrontService.productSearch(info);
	}

	// 搜索商品结果按"销量排序"/"价格优先"--后端成功-/"评价为主"--未做
	//销量排序-总销量
	@RequestMapping(method = RequestMethod.GET, value = "index/search/sort")
	public @ResponseBody Message productSearchSort(String info,String sort) throws Exception {
		return shopViewFrontService.productSearchSort(info,sort);
	}
	
	// 根据二级标签搜索商品及量列表-后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/typetwo")
	public @ResponseBody Message typeTwoProducts(String typetwocontent) throws Exception {
		return shopViewFrontService.typeTwoProducts(typetwocontent);
	}
	
	// 根据二级标签搜索商品及量列表-"销量排序"/"价格优先"-后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/typetwo/sort")
	public @ResponseBody Message typeTwoProductsSort(String typetwocontent,String sort) throws Exception {
		return shopViewFrontService.typeTwoProductsSort(typetwocontent,sort);
	}

	// 显示某个商品的详细信息及数量-后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/product")
	public @ResponseBody Message getProduct(int productid) throws Exception {
		return shopViewFrontService.getProduct(productid);
	}

	// 未登录时，看了又看 根据商品 日浏览量 降序排序显示--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/repeated")
	public @ResponseBody Message repeatedView() throws Exception {
		return shopViewFrontService.repeatedView();
	}

	// 老人以登录时，根据老人浏览表 降序排序显示--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/older/repeated")
	public @ResponseBody Message repeatedOlderView(int olderid) throws Exception {
		// int olderid=session.getAttribute("olderid")
	    olderid = 1;
		return shopViewFrontService.repeatedOlderView(olderid);
	}
	
	//查看一个商品的评价等级详情--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/product/rate")
	public @ResponseBody Message getProductGrade(int productid) throws Exception {

		return shopViewFrontService.getProductGrade(productid);
	}
	
	//查看一个商品的所有评价及信息--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/product/rate/info")
	public @ResponseBody Message getProductRateInfo(int productid) throws Exception {

		return shopViewFrontService.getProductRateInfo(productid);
	}
	

	// 显示按照团购发起日期排序好的商品页面--团购1
	@RequestMapping(method = RequestMethod.GET, value = "group/index")
	public @ResponseBody Message getGroupIndex() throws Exception {

		return shopViewFrontService.GroupIndexView();
	}
	
	// 显示按照离团购结束日期一天的商品页面--团购2
	@RequestMapping(method = RequestMethod.GET, value = "group/end")
	public @ResponseBody Message getGroupEnd() throws Exception {

		return shopViewFrontService.GroupEndView();
	}
	
	// 显示按照商品“原价-折扣价” 差值最大的降序排序的商品页面--超值
	
	
}

package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.pojo.LoginMassage;
import com.sds.em.service.ShopViewFrontService;

/*
 * 作者：刘露
 * 描述：电商管理系统-页面展示的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/shop/")
public class ShopViewFrontController {
	@Autowired
	ShopViewFrontService shopViewFrontService;

	@RequestMapping(method = RequestMethod.GET, value = "judgeLogin")
	public @ResponseBody Message session(HttpSession session) throws Exception {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		}else{
			int olderid = loginMassage.getOlderid();
			String oldername = loginMassage.getOldername();
			String olderaddress = loginMassage.getOlderaddress();
			loginMassage.setOlderid(olderid);
			loginMassage.setOldername(oldername);
			loginMassage.setOlderaddress(olderaddress);
			return new Message(true, "已登录", loginMassage);
		}
	
	}

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
	// 销量排序-总销量
	@RequestMapping(method = RequestMethod.GET, value = "index/search/sort")
	public @ResponseBody Message productSearchSort(String info, String sort) throws Exception {
		return shopViewFrontService.productSearchSort(info, sort);
	}

	// 根据二级标签搜索商品及量列表-后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/typetwo")
	public @ResponseBody Message typeTwoProducts(String typetwocontent) throws Exception {
		return shopViewFrontService.typeTwoProducts(typetwocontent);
	}

	// 根据二级标签搜索商品及量列表-"销量排序"/"价格优先"-后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/typetwo/sort")
	public @ResponseBody Message typeTwoProductsSort(String typetwocontent, String sort) throws Exception {
		return shopViewFrontService.typeTwoProductsSort(typetwocontent, sort);
	}

	// 显示某个商品的详细信息及数量-后端成功--修订，判断登录否，加老人浏览表-全部成功
	@RequestMapping(method = RequestMethod.GET, value = "index/product")
	public @ResponseBody Message getProduct(HttpSession session, int productid) throws Exception {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		if (loginMassage == null) {
			return shopViewFrontService.getProduct(productid);//未登录，只能查看信息
		}else{
			int olderid = loginMassage.getOlderid();
			Boolean flag = shopViewFrontService.addOlderProductBrowse(olderid, productid);
			if (flag) {
				return shopViewFrontService.getProduct(productid);
			} else {
				return new Message(false, "老人记录表更新失败", null);
			}
		}
	}

	// 看了又看 根据商品 日浏览量 降序排序显示--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/repeated")
	public @ResponseBody Message repeatedView(HttpSession session) throws Exception {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		if (loginMassage == null) {
			return shopViewFrontService.repeatedView();
		} else {
			int olderid = loginMassage.getOlderid();
			return shopViewFrontService.repeatedOlderView(olderid);
		}

	}

	/*
	 * // 老人以登录时，根据老人浏览表 降序排序显示--后端成功
	 * 
	 * @RequestMapping(method = RequestMethod.GET, value =
	 * "index/older/repeated") public @ResponseBody Message repeatedOlderView()
	 * throws Exception { // int olderid=session.getAttribute("olderid") olderid
	 * = 1; return shopViewFrontService.repeatedOlderView(olderid); }
	 */

	// 查看一个商品的评价等级详情--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/product/rate")
	public @ResponseBody Message getProductGrade(int productid) throws Exception {

		return shopViewFrontService.getProductGrade(productid);
	}

	// 查看一个商品的所有评价及信息--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/product/rate/info")
	public @ResponseBody Message getProductRateInfo(int productid) throws Exception {

		return shopViewFrontService.getProductRateInfo(productid);
	}

	// 显示按照团购开团排序好的商品页面--即将开团 --后端成功-修改成-最新团购--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "group/index")
	public @ResponseBody Message getGroupIndex() throws Exception {

		return shopViewFrontService.GroupIndexView();
	}

	// 显示按照离团购结束日期排序的商品页面--即将截止--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "group/end")
	public @ResponseBody Message getGroupEnd() throws Exception {

		return shopViewFrontService.GroupEndView();
	}

	// 显示显示为开团的团购，再按时间排序--未开团--后端成功

	@RequestMapping(method = RequestMethod.GET, value = "group/no")
	public @ResponseBody Message getGroupNo() throws Exception {

		return shopViewFrontService.GroupNoView();
	}

	// 显示特惠的商品，按原价减去折扣价最大的排序显示
	@RequestMapping(method = RequestMethod.GET, value = "preferential")
	public @ResponseBody Message preferentialView() throws Exception {
		return shopViewFrontService.preferentialView();
	}

	// 猜你喜欢（未登录时）-推荐本商品的同标签下的商品--后端成功
	@RequestMapping(method = RequestMethod.GET, value = "index/product/guesslike")
	public @ResponseBody Message guessLikeView(HttpSession session, int productid) throws Exception {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		if (loginMassage == null) {
			return shopViewFrontService.guessLikeView(productid);
		} else {
			int olderid = loginMassage.getOlderid();
			return shopViewFrontService.guessLikeOlderView(olderid);
		}

	}
	/*
	 * // 猜你喜欢(已登录时)-推荐老人浏览表的相关标签下的商品
	 * 
	 * @RequestMapping(method = RequestMethod.GET, value =
	 * "index/older/product/guesslike") public @ResponseBody Message
	 * guessLikeOlderView(int olderid) throws Exception {
	 * 
	 * return shopViewFrontService.guessLikeOlderView(olderid); }
	 */

	// 获取放大镜中的本商品的三张图片
	@RequestMapping(method = RequestMethod.GET, value = "index/product/magnifyingglass")
	public @ResponseBody Message magnifyingGlassView(int productid) throws Exception {

		return shopViewFrontService.magnifyingGlassView(productid);
	}

	// 显示某个团购商品的团购信息
	@RequestMapping(method = RequestMethod.GET, value = "index/product/group")
	public @ResponseBody Message getProductGroup(int groupid) throws Exception {
		return shopViewFrontService.getProductGroup(groupid);
	}

	// 显示现有购物车中本老人的商品数量
	@RequestMapping(method = RequestMethod.GET, value = "older/cart/amount")
	public @ResponseBody Message getOlderCartAmount(HttpSession session) throws Exception {
		LoginMassage loginMassage = null;
		loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		if (loginMassage == null) {
			return new Message(false, "未登录", null);
		} else {
			int olderid = loginMassage.getOlderid();
			return shopViewFrontService.getOlderCartAmount(olderid);
		}
	}

}

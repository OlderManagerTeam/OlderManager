package com.sds.em.service;

import java.util.List;

import com.sds.em.po.Message;
import com.sds.em.shop.pojo.productGradeExtend;
import com.sds.em.shop.pojo.productGradeExtend;

public interface ShopViewFrontService {
	// 根据商品日销量进行 =今天推荐-只推荐最高的三个商品
	public Message todayRecommend() throws Exception;

	// 每一种类按照月销量 推荐八种商品显示（商品缩略图和价格）
	public Message typeRecommend(String typecontent) throws Exception;

	// 搜索商品，只跟商品名字和商品信息进行匹配
	public Message productSearch(String info) throws Exception;

	// 根据二级标签搜索商品及量列表
	public Message typeTwoProducts(String typetwocontent) throws Exception;

	// 根据二级标签搜索商品及量列表-"销量排序"/"价格优先"
	public Message typeTwoProductsSort(String typetwocontent, String sort) throws Exception;

	// 显示某个商品的详细信息及数量
	public Message getProduct(int productid) throws Exception;

	// 未登录时，看了又看 根据商品 日浏览量 降序排序显示
	public Message repeatedView() throws Exception;

	// 老人以登录时，根据老人浏览表 降序排序显示
	public Message repeatedOlderView(int olderid) throws Exception;

	// 搜索商品结果按"销量排序"/"价格优先"/"评价为主"
	public Message productSearchSort(String info, String sort) throws Exception;

	// 查看一个商品的评价等级详情
	public Message getProductGrade(int productid);

	// 查看一个商品的所有评价及信息
	public Message getProductRateInfo(int productid);

	// 显示按照团购发起日期排序好的商品页面--团购1
	public Message GroupIndexView();

	// 显示按照离团购结束日期一天的商品页面--团购2
	public Message GroupEndView();

	// 显示显示为开团的团购，再按时间排序--未开团
	public Message GroupNoView();

}

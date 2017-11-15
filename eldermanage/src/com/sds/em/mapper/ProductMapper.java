package com.sds.em.mapper;

import com.sds.em.po.Message;
import com.sds.em.po.Product;
import com.sds.em.po.ProductExample;
import com.sds.em.po.Productrate;
import com.sds.em.shop.pojo.ConfirmOrderViewExtend;
import com.sds.em.shop.pojo.ProductAmount;
import com.sds.em.shop.pojo.ProductGroupExtend;
import com.sds.em.shop.pojo.productGradeExtend;
import com.sds.em.shopfront.pojo.RightNowPayExtend;
import com.sds.em.shop.pojo.productGradeExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public interface ProductMapper {
	int countByExample(ProductExample example);

	int deleteByExample(ProductExample example);

	int deleteByPrimaryKey(Integer productid);

	int insert(Product record);

	int insertSelective(Product record);

	List<Product> selectByExample(ProductExample example);

	Product selectByPrimaryKey(Integer productid);

	int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByPrimaryKeySelective(Product record);

	int updateByPrimaryKey(Product record);

	// 根据商品日销量进行 =今天推荐-只推荐最高的三个商品
	public List<Product> todayRecommend();

	// 每一种类按照月销量 推荐6种商品显示（商品缩略图和价格）
	public List<Product> typeRecommend(String typecontent);

	// 搜索返回id,只跟商品名字和商品信息进行匹配
	public List<Product> productSearch(String info);

	// 根据搜索商品及量
	public ProductAmount productSearchId(int productid);

	// 搜索商品结果按"销量排序"
	public List<ProductAmount> productSearchSortA(String info);

	// 搜索商品结果按"价格优先"
	public List<ProductAmount> productSearchSortP(String info);

	/*
	 * // 搜索商品结果按"评价为主" public List<ProductAmount> productSearchSortR(String
	 * info);
	 */

	// 根据二级标签搜索商品及量列表
	public List<ProductAmount> typeTwoRecommend(String typetwocontent);

	// 根据二级标签搜索商品及量列表-"销量排序"

	List<ProductAmount> typeTwoRecommendA(String typetwocontent);

	// 根据二级标签搜索商品及量列表-"价格优先"
	public List<ProductAmount> typeTwoRecommendP(String typetwocontent);

	// 未登录时，看了又看 根据商品 日浏览量 降序排序显示
	public List<Product> repeatedView();

	void keyinsert(Product product);

	// 立即购买-确认订单页面
	public List<ConfirmOrderViewExtend> confirmOrderRightNow(RightNowPayExtend rightNowPayExtend);

	// 显示特惠的商品，按原价减去折扣价最大的排序显示
	public List<ProductAmount> preferentialView();
}

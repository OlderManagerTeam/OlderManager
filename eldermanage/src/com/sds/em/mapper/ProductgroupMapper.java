package com.sds.em.mapper;

import com.sds.em.po.Product;
import com.sds.em.po.Productgroup;
import com.sds.em.po.ProductgroupExample;
import com.sds.em.pojo.ProductgroupExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductgroupMapper {
	int countByExample(ProductgroupExample example);

	int deleteByExample(ProductgroupExample example);

	int deleteByPrimaryKey(Integer groupid);

	int insert(Productgroup record);

	int insertSelective(Productgroup record);

	List<Productgroup> selectByExample(ProductgroupExample example);

	Productgroup selectByPrimaryKey(Integer groupid);

	int updateByExampleSelective(@Param("record") Productgroup record, @Param("example") ProductgroupExample example);

	int updateByExample(@Param("record") Productgroup record, @Param("example") ProductgroupExample example);

	int updateByPrimaryKeySelective(Productgroup record);

	int updateByPrimaryKey(Productgroup record);

	// wuwenbo,获取团购表
	List<ProductgroupExtend> getproductgroup();

	// lu
	// 显示按照团购开团排序好的商品页面--即将开团
	public List<Product> GroupIndexView();

	// 显示按照离团购结束日期排序的商品页面--即将截止
	public List<Product> GroupEndView();

	// 显示显示为开团的团购，再按时间排序--未开团
	public List<Product> GroupNoView();

}
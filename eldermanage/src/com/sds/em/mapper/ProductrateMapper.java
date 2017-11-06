package com.sds.em.mapper;

import com.sds.em.po.Productrate;
import com.sds.em.po.ProductrateExample;
import com.sds.em.pojo.ProductrateExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductrateMapper {
    int countByExample(ProductrateExample example);

    int deleteByExample(ProductrateExample example);

    int deleteByPrimaryKey(Integer rateid);

    int insert(Productrate record);

    int insertSelective(Productrate record);

    List<Productrate> selectByExample(ProductrateExample example);

    Productrate selectByPrimaryKey(Integer rateid);

    int updateByExampleSelective(@Param("record") Productrate record, @Param("example") ProductrateExample example);

    int updateByExample(@Param("record") Productrate record, @Param("example") ProductrateExample example);

    int updateByPrimaryKeySelective(Productrate record);

    int updateByPrimaryKey(Productrate record);
    
    //wuwenbo，得到订单评价
    List<ProductrateExtend> getorderrate(int orderid);
	// wuwenbo，得到商品评价
	List<ProductrateExtend> getproductrate(int productid);

	// lu
	// 查看一个商品的所有评价及信息
	public List<Productrate> getProductRateInfo(int productid);
}
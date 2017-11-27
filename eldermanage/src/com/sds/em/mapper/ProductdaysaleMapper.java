package com.sds.em.mapper;

import com.sds.em.po.Product;
import com.sds.em.po.Productdaysale;
import com.sds.em.po.ProductdaysaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductdaysaleMapper {
    int countByExample(ProductdaysaleExample example);

    int deleteByExample(ProductdaysaleExample example);

    int deleteByPrimaryKey(Long pdsid);

    int insert(Productdaysale record);

    int insertSelective(Productdaysale record);

    List<Productdaysale> selectByExample(ProductdaysaleExample example);

    Productdaysale selectByPrimaryKey(Long pdsid);

    int updateByExampleSelective(@Param("record") Productdaysale record, @Param("example") ProductdaysaleExample example);

    int updateByExample(@Param("record") Productdaysale record, @Param("example") ProductdaysaleExample example);

    int updateByPrimaryKeySelective(Productdaysale record);

    int updateByPrimaryKey(Productdaysale record);
    
    //返回商品近十天的浏览量和销售量
    List<Productdaysale> daysales(Product productid);

	// 商城近十二月数据浏览量和销售量 wuwenbo
	List<Productdaysale> monthsales(Product productid);

}
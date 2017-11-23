package com.sds.em.mapper;

import com.sds.em.po.Productstore;
import com.sds.em.po.ProductstoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductstoreMapper {
    int countByExample(ProductstoreExample example);

    int deleteByExample(ProductstoreExample example);

    int deleteByPrimaryKey(Integer storeid);

    int insert(Productstore record);

    int insertSelective(Productstore record);

    List<Productstore> selectByExample(ProductstoreExample example);

    Productstore selectByPrimaryKey(Integer storeid);

    int updateByExampleSelective(@Param("record") Productstore record, @Param("example") ProductstoreExample example);

    int updateByExample(@Param("record") Productstore record, @Param("example") ProductstoreExample example);

    int updateByPrimaryKeySelective(Productstore record);

    int updateByPrimaryKey(Productstore record);
    //wuwenbo,查看库存
	List<com.sds.em.pojo.ProductstoreExtend> getproductstore();
	
	//wenbowu,分类查看库存
	List<com.sds.em.po.Producttype> typestorecount();
}
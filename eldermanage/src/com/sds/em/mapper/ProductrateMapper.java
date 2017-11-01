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
    
    List<ProductrateExtend> getproductrate(int productid);
}
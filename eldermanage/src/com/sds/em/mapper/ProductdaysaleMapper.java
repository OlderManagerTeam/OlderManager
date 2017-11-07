package com.sds.em.mapper;

import com.sds.em.po.Productdaysale;
import com.sds.em.po.ProductdaysaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductdaysaleMapper {
    int countByExample(ProductdaysaleExample example);

    int deleteByExample(ProductdaysaleExample example);

    int insert(Productdaysale record);

    int insertSelective(Productdaysale record);

    List<Productdaysale> selectByExample(ProductdaysaleExample example);

    int updateByExampleSelective(@Param("record") Productdaysale record, @Param("example") ProductdaysaleExample example);

    int updateByExample(@Param("record") Productdaysale record, @Param("example") ProductdaysaleExample example);
}
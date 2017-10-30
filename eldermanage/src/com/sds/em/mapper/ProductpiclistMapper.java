package com.sds.em.mapper;

import com.sds.em.po.Productpiclist;
import com.sds.em.po.ProductpiclistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductpiclistMapper {
    int countByExample(ProductpiclistExample example);

    int deleteByExample(ProductpiclistExample example);

    int deleteByPrimaryKey(Integer ppicid);

    int insert(Productpiclist record);

    int insertSelective(Productpiclist record);

    List<Productpiclist> selectByExample(ProductpiclistExample example);

    Productpiclist selectByPrimaryKey(Integer ppicid);

    int updateByExampleSelective(@Param("record") Productpiclist record, @Param("example") ProductpiclistExample example);

    int updateByExample(@Param("record") Productpiclist record, @Param("example") ProductpiclistExample example);

    int updateByPrimaryKeySelective(Productpiclist record);

    int updateByPrimaryKey(Productpiclist record);
}
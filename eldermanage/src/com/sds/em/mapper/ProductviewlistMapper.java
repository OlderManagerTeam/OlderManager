package com.sds.em.mapper;

import com.sds.em.po.Productviewlist;
import com.sds.em.po.ProductviewlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductviewlistMapper {
    int countByExample(ProductviewlistExample example);

    int deleteByExample(ProductviewlistExample example);

    int deleteByPrimaryKey(Integer pviewpicid);

    int insert(Productviewlist record);

    int insertSelective(Productviewlist record);

    List<Productviewlist> selectByExample(ProductviewlistExample example);

    Productviewlist selectByPrimaryKey(Integer pviewpicid);

    int updateByExampleSelective(@Param("record") Productviewlist record, @Param("example") ProductviewlistExample example);

    int updateByExample(@Param("record") Productviewlist record, @Param("example") ProductviewlistExample example);

    int updateByPrimaryKeySelective(Productviewlist record);

    int updateByPrimaryKey(Productviewlist record);
}
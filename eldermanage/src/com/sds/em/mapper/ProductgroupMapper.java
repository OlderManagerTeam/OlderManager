package com.sds.em.mapper;

import com.sds.em.po.Productgroup;
import com.sds.em.po.ProductgroupExample;
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
}
package com.sds.em.mapper;

import com.sds.em.po.ShiroroleExample;
import com.sds.em.po.ShiroroleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiroroleMapper {
    int countByExample(ShiroroleExample example);

    int deleteByExample(ShiroroleExample example);

    int deleteByPrimaryKey(ShiroroleKey key);

    int insert(ShiroroleKey record);

    int insertSelective(ShiroroleKey record);

    List<ShiroroleKey> selectByExample(ShiroroleExample example);

    int updateByExampleSelective(@Param("record") ShiroroleKey record, @Param("example") ShiroroleExample example);

    int updateByExample(@Param("record") ShiroroleKey record, @Param("example") ShiroroleExample example);
    
    //wuwenbo 返回所有角色
    List<String> getroles();
}
package com.sds.em.mapper;

import com.sds.em.po.Regionresources;
import com.sds.em.po.RegionresourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionresourcesMapper {
    int countByExample(RegionresourcesExample example);

    int deleteByExample(RegionresourcesExample example);

    int deleteByPrimaryKey(Integer regionresourcesid);

    int insert(Regionresources record);

    int insertSelective(Regionresources record);

    List<Regionresources> selectByExample(RegionresourcesExample example);

    Regionresources selectByPrimaryKey(Integer regionresourcesid);

    int updateByExampleSelective(@Param("record") Regionresources record, @Param("example") RegionresourcesExample example);

    int updateByExample(@Param("record") Regionresources record, @Param("example") RegionresourcesExample example);

    int updateByPrimaryKeySelective(Regionresources record);

    int updateByPrimaryKey(Regionresources record);
}
package com.sds.em.mapper;

import com.sds.em.po.Videocollection;
import com.sds.em.po.VideocollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideocollectionMapper {
    int countByExample(VideocollectionExample example);

    int deleteByExample(VideocollectionExample example);

    int deleteByPrimaryKey(Integer videocollectionid);

    int insert(Videocollection record);

    int insertSelective(Videocollection record);

    List<Videocollection> selectByExample(VideocollectionExample example);

    Videocollection selectByPrimaryKey(Integer videocollectionid);

    int updateByExampleSelective(@Param("record") Videocollection record, @Param("example") VideocollectionExample example);

    int updateByExample(@Param("record") Videocollection record, @Param("example") VideocollectionExample example);

    int updateByPrimaryKeySelective(Videocollection record);

    int updateByPrimaryKey(Videocollection record);
}
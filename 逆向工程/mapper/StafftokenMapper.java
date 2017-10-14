package com.sds.em.mapper;

import com.sds.em.po.Stafftoken;
import com.sds.em.po.StafftokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StafftokenMapper {
    int countByExample(StafftokenExample example);

    int deleteByExample(StafftokenExample example);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Stafftoken record);

    int insertSelective(Stafftoken record);

    List<Stafftoken> selectByExample(StafftokenExample example);

    Stafftoken selectByPrimaryKey(Integer staffid);

    int updateByExampleSelective(@Param("record") Stafftoken record, @Param("example") StafftokenExample example);

    int updateByExample(@Param("record") Stafftoken record, @Param("example") StafftokenExample example);

    int updateByPrimaryKeySelective(Stafftoken record);

    int updateByPrimaryKey(Stafftoken record);
}
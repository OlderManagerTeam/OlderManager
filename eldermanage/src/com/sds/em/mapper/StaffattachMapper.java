package com.sds.em.mapper;

import com.sds.em.po.Staffattach;
import com.sds.em.po.StaffattachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffattachMapper {
    int countByExample(StaffattachExample example);

    int deleteByExample(StaffattachExample example);

    int insert(Staffattach record);

    int insertSelective(Staffattach record);

    List<Staffattach> selectByExample(StaffattachExample example);

    int updateByExampleSelective(@Param("record") Staffattach record, @Param("example") StaffattachExample example);

    int updateByExample(@Param("record") Staffattach record, @Param("example") StaffattachExample example);
}
package com.sds.em.mapper;

import com.sds.em.po.Joingroup;
import com.sds.em.po.JoingroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoingroupMapper {
    int countByExample(JoingroupExample example);

    int deleteByExample(JoingroupExample example);

    int deleteByPrimaryKey(Integer joingroupid);

    int insert(Joingroup record);

    int insertSelective(Joingroup record);

    List<Joingroup> selectByExample(JoingroupExample example);

    Joingroup selectByPrimaryKey(Integer joingroupid);

    int updateByExampleSelective(@Param("record") Joingroup record, @Param("example") JoingroupExample example);

    int updateByExample(@Param("record") Joingroup record, @Param("example") JoingroupExample example);

    int updateByPrimaryKeySelective(Joingroup record);

    int updateByPrimaryKey(Joingroup record);
}
package com.sds.em.mapper;

import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderbaseMapper {
    int countByExample(OlderbaseExample example);

    int deleteByExample(OlderbaseExample example);

    int deleteByPrimaryKey(Integer olderid);

    int insert(Olderbase record);

    int insertSelective(Olderbase record);

    List<Olderbase> selectByExample(OlderbaseExample example);

    Olderbase selectByPrimaryKey(Integer olderid);

    int updateByExampleSelective(@Param("record") Olderbase record, @Param("example") OlderbaseExample example);

    int updateByExample(@Param("record") Olderbase record, @Param("example") OlderbaseExample example);

    int updateByPrimaryKeySelective(Olderbase record);

    int updateByPrimaryKey(Olderbase record);
    //lu 2017-10-12:录入老人基本信息，并传回id 
    public int insertOlderBase(Olderbase olderbase);
}
package com.sds.em.mapper;

import com.sds.em.po.Oldersick;
import com.sds.em.po.OldersickExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldersickMapper {
    int countByExample(OldersickExample example);

    int deleteByExample(OldersickExample example);

    int deleteByPrimaryKey(Integer sickid);

    int insert(Oldersick record);

    int insertSelective(Oldersick record);

    List<Oldersick> selectByExample(OldersickExample example);

    Oldersick selectByPrimaryKey(Integer sickid);

    int updateByExampleSelective(@Param("record") Oldersick record, @Param("example") OldersickExample example);

    int updateByExample(@Param("record") Oldersick record, @Param("example") OldersickExample example);

    int updateByPrimaryKeySelective(Oldersick record);

    int updateByPrimaryKey(Oldersick record);

    //lu 2017-10-12:录入老人病历信息
    public int insertOlderSick(Oldersick oldersick);

}
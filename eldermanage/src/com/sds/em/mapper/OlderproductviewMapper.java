package com.sds.em.mapper;

import com.sds.em.po.Olderproductview;
import com.sds.em.po.OlderproductviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderproductviewMapper {
    int countByExample(OlderproductviewExample example);

    int deleteByExample(OlderproductviewExample example);

    int deleteByPrimaryKey(Integer productviewid);

    int insert(Olderproductview record);

    int insertSelective(Olderproductview record);

    List<Olderproductview> selectByExample(OlderproductviewExample example);

    Olderproductview selectByPrimaryKey(Integer productviewid);

    int updateByExampleSelective(@Param("record") Olderproductview record, @Param("example") OlderproductviewExample example);

    int updateByExample(@Param("record") Olderproductview record, @Param("example") OlderproductviewExample example);

    int updateByPrimaryKeySelective(Olderproductview record);

    int updateByPrimaryKey(Olderproductview record);
}
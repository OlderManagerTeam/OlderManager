package com.sds.em.mapper;

import com.sds.em.po.Droit;
import com.sds.em.po.DroitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DroitMapper {
    int countByExample(DroitExample example);

    int deleteByExample(DroitExample example);

    int deleteByPrimaryKey(Integer droitid);

    int insert(Droit record);

    int insertSelective(Droit record);

    List<Droit> selectByExample(DroitExample example);

    Droit selectByPrimaryKey(Integer droitid);

    int updateByExampleSelective(@Param("record") Droit record, @Param("example") DroitExample example);

    int updateByExample(@Param("record") Droit record, @Param("example") DroitExample example);

    int updateByPrimaryKeySelective(Droit record);

    int updateByPrimaryKey(Droit record);
}
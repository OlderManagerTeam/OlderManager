package com.sds.em.mapper;

import com.sds.em.po.Action;
import com.sds.em.po.ActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActionMapper {
    int countByExample(ActionExample example);

    int deleteByExample(ActionExample example);

    int deleteByPrimaryKey(Integer actionid);

    int insert(Action record);

    int insertSelective(Action record);

    List<Action> selectByExample(ActionExample example);

    Action selectByPrimaryKey(Integer actionid);

    int updateByExampleSelective(@Param("record") Action record, @Param("example") ActionExample example);

    int updateByExample(@Param("record") Action record, @Param("example") ActionExample example);

    int updateByPrimaryKeySelective(Action record);

    int updateByPrimaryKey(Action record);
}
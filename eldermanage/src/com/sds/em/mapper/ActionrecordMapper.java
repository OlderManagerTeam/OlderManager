package com.sds.em.mapper;

import com.sds.em.po.Actionrecord;
import com.sds.em.po.ActionrecordExample;
import com.sds.em.pojo.ActionRecordOlderExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActionrecordMapper {
    int countByExample(ActionrecordExample example);

    int deleteByExample(ActionrecordExample example);

    int deleteByPrimaryKey(Integer arecordid);

    int insert(Actionrecord record);

    int insertSelective(Actionrecord record);

    List<Actionrecord> selectByExample(ActionrecordExample example);

    Actionrecord selectByPrimaryKey(Integer arecordid);

    int updateByExampleSelective(@Param("record") Actionrecord record, @Param("example") ActionrecordExample example);

    int updateByExample(@Param("record") Actionrecord record, @Param("example") ActionrecordExample example);

    int updateByPrimaryKeySelective(Actionrecord record);

    int updateByPrimaryKey(Actionrecord record);
    

    //wuwenbo,获取活动记录信息以及老人信息
       List<ActionRecordOlderExtend> getactionRecordinfo(Integer arecordid);
}
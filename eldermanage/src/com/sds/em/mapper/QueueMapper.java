package com.sds.em.mapper;

import com.sds.em.po.Queue;
import com.sds.em.po.QueueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueueMapper {
    int countByExample(QueueExample example);

    int deleteByExample(QueueExample example);

    int deleteByPrimaryKey(Integer queueid);

    int insert(Queue record);

    int insertSelective(Queue record);

    List<Queue> selectByExample(QueueExample example);

    Queue selectByPrimaryKey(Integer queueid);

    int updateByExampleSelective(@Param("record") Queue record, @Param("example") QueueExample example);

    int updateByExample(@Param("record") Queue record, @Param("example") QueueExample example);

    int updateByPrimaryKeySelective(Queue record);

    int updateByPrimaryKey(Queue record);
}
package com.sds.em.mapper;

import com.sds.em.po.Visited;
import com.sds.em.po.VisitedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitedMapper {
    int countByExample(VisitedExample example);

    int deleteByExample(VisitedExample example);

    int deleteByPrimaryKey(Integer visitedid);

    int insert(Visited record);

    int insertSelective(Visited record);

    List<Visited> selectByExample(VisitedExample example);

    Visited selectByPrimaryKey(Integer visitedid);

    int updateByExampleSelective(@Param("record") Visited record, @Param("example") VisitedExample example);

    int updateByExample(@Param("record") Visited record, @Param("example") VisitedExample example);

    int updateByPrimaryKeySelective(Visited record);

    int updateByPrimaryKey(Visited record);
}
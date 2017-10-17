package com.sds.em.mapper;

import com.sds.em.po.Oldertoken;
import com.sds.em.po.OldertokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldertokenMapper {
    int countByExample(OldertokenExample example);

    int deleteByExample(OldertokenExample example);

    int deleteByPrimaryKey(Integer olderid);

    int insert(Oldertoken record);

    int insertSelective(Oldertoken record);

    List<Oldertoken> selectByExample(OldertokenExample example);

    Oldertoken selectByPrimaryKey(Integer olderid);

    int updateByExampleSelective(@Param("record") Oldertoken record, @Param("example") OldertokenExample example);

    int updateByExample(@Param("record") Oldertoken record, @Param("example") OldertokenExample example);

    int updateByPrimaryKeySelective(Oldertoken record);

    int updateByPrimaryKey(Oldertoken record);
}
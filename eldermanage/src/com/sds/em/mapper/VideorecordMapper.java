package com.sds.em.mapper;

import com.sds.em.po.Videorecord;
import com.sds.em.po.VideorecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideorecordMapper {
    int countByExample(VideorecordExample example);

    int deleteByExample(VideorecordExample example);

    int deleteByPrimaryKey(Integer vrecordid);

    int insert(Videorecord record);

    int insertSelective(Videorecord record);

    List<Videorecord> selectByExample(VideorecordExample example);

    Videorecord selectByPrimaryKey(Integer vrecordid);

    int updateByExampleSelective(@Param("record") Videorecord record, @Param("example") VideorecordExample example);

    int updateByExample(@Param("record") Videorecord record, @Param("example") VideorecordExample example);

    int updateByPrimaryKeySelective(Videorecord record);

    int updateByPrimaryKey(Videorecord record);
}
package com.sds.em.mapper;

import com.sds.em.po.Video;
import com.sds.em.po.VideoExample;
import com.sds.em.po.Videorecord;
import com.sds.em.po.VideorecordExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer videoid);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer videoid);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
    
    Video selectOlderVideoRecord(@Param("example") VideorecordExample example);
}
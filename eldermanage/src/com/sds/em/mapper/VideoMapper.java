package com.sds.em.mapper;

import com.sds.em.po.Olderbase;
import com.sds.em.po.Video;
import com.sds.em.po.VideoExample;
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
    
    List<Video> select_video_healthy();
    
    List<Video> select_video_lecture();
    
    List<Video> select_videocollection_true(Olderbase olderbase);
    List<Video> select_videocollection_false(Olderbase olderbase);

	//一周视频上传时长
    List<Video> weekvediotime();
  //一周最热视频
	List<Video> weekheatvedio();
	//一周上传视频情况
	List<Video> weekaddvedio();
	//一周上收藏最多
	List<Video> weekvediocolle();
	// 一周访问量
	List<Video> weekvedioview();
}
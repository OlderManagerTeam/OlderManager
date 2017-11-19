package com.sds.em.mapper;

import com.sds.em.po.News;
import com.sds.em.po.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
	int countByExample(NewsExample example);

	int deleteByExample(NewsExample example);

	int deleteByPrimaryKey(Integer newsid);

	int insert(News record);

	int insertSelective(News record);

	List<News> selectByExampleWithBLOBs(NewsExample example);

	List<News> selectByExample(NewsExample example);

	News selectByPrimaryKey(Integer newsid);

	int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

	int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

	int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

	int updateByPrimaryKeySelective(News record);

	int updateByPrimaryKeyWithBLOBs(News record);

	int updateByPrimaryKey(News record);

	// lu
	// 显示知识普及新闻-按照发布时间排序
	public List<News> CommonNewsView();

	// 显示健康养生新闻-按照发布时间排序
	public List<News> healthNewsView();

	// 不论两类，按照访问量进行排序的热门新闻
	public List<News> heatNewsView();
}
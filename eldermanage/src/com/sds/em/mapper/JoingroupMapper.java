package com.sds.em.mapper;

import com.sds.em.po.Joingroup;
import com.sds.em.po.JoingroupExample;
import com.sds.em.pojo.JoingroupExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoingroupMapper {
    int countByExample(JoingroupExample example);

    int deleteByExample(JoingroupExample example);

    int deleteByPrimaryKey(Integer joingroupid);

    int insert(Joingroup record);

    int insertSelective(Joingroup record);

    List<Joingroup> selectByExample(JoingroupExample example);

    Joingroup selectByPrimaryKey(Integer joingroupid);

    int updateByExampleSelective(@Param("record") Joingroup record, @Param("example") JoingroupExample example);

    int updateByExample(@Param("record") Joingroup record, @Param("example") JoingroupExample example);

    int updateByPrimaryKeySelective(Joingroup record);

    int updateByPrimaryKey(Joingroup record);

    //查看团购参加者
	List<JoingroupExtend> getJoingroup(int groupid);
	
    //查看近10天团购信息
	List<Joingroup> dayjoingroup();

	//获取近12月的团购数据
	List<Joingroup> monthjoingroup();
}
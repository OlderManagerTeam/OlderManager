package com.sds.em.mapper;

import com.sds.em.po.Lecture;
import com.sds.em.po.LectureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LectureMapper {
	int countByExample(LectureExample example);

	int deleteByExample(LectureExample example);

	int deleteByPrimaryKey(Integer lectureid);

	int insert(Lecture record);

	int insertSelective(Lecture record);

	List<Lecture> selectByExample(LectureExample example);

	Lecture selectByPrimaryKey(Integer lectureid);

	int updateByExampleSelective(@Param("record") Lecture record, @Param("example") LectureExample example);

	int updateByExample(@Param("record") Lecture record, @Param("example") LectureExample example);

	int updateByPrimaryKeySelective(Lecture record);

	int updateByPrimaryKey(Lecture record);
	
}
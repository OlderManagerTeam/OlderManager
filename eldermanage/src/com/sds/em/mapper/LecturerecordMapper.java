package com.sds.em.mapper;

import com.sds.em.po.Lecturerecord;
import com.sds.em.po.LecturerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LecturerecordMapper {
    int countByExample(LecturerecordExample example);

    int deleteByExample(LecturerecordExample example);

    int deleteByPrimaryKey(Integer lrecordid);

    int insert(Lecturerecord record);

    int insertSelective(Lecturerecord record);

    List<Lecturerecord> selectByExample(LecturerecordExample example);

    Lecturerecord selectByPrimaryKey(Integer lrecordid);

    int updateByExampleSelective(@Param("record") Lecturerecord record, @Param("example") LecturerecordExample example);

    int updateByExample(@Param("record") Lecturerecord record, @Param("example") LecturerecordExample example);

    int updateByPrimaryKeySelective(Lecturerecord record);

    int updateByPrimaryKey(Lecturerecord record);
    
    
}
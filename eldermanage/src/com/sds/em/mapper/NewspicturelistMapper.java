package com.sds.em.mapper;

import com.sds.em.po.Newspicturelist;
import com.sds.em.po.NewspicturelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewspicturelistMapper {
    int countByExample(NewspicturelistExample example);

    int deleteByExample(NewspicturelistExample example);

    int deleteByPrimaryKey(Integer newspicturelistid);

    int insert(Newspicturelist record);

    int insertSelective(Newspicturelist record);

    List<Newspicturelist> selectByExample(NewspicturelistExample example);

    Newspicturelist selectByPrimaryKey(Integer newspicturelistid);

    int updateByExampleSelective(@Param("record") Newspicturelist record, @Param("example") NewspicturelistExample example);

    int updateByExample(@Param("record") Newspicturelist record, @Param("example") NewspicturelistExample example);

    int updateByPrimaryKeySelective(Newspicturelist record);

    int updateByPrimaryKey(Newspicturelist record);
}
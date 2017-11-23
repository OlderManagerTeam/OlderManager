package com.sds.em.mapper;

import com.sds.em.po.Oldermessage;
import com.sds.em.po.OldermessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldermessageMapper {
    int countByExample(OldermessageExample example);

    int deleteByExample(OldermessageExample example);

    int deleteByPrimaryKey(Integer messageid);

    int insert(Oldermessage record);

    int insertSelective(Oldermessage record);

    List<Oldermessage> selectByExample(OldermessageExample example);

    Oldermessage selectByPrimaryKey(Integer messageid);

    int updateByExampleSelective(@Param("record") Oldermessage record, @Param("example") OldermessageExample example);

    int updateByExample(@Param("record") Oldermessage record, @Param("example") OldermessageExample example);

    int updateByPrimaryKeySelective(Oldermessage record);

    int updateByPrimaryKey(Oldermessage record);
}
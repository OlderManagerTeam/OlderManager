package com.sds.em.mapper;

import com.sds.em.po.Security;
import com.sds.em.po.SecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityMapper {
    int countByExample(SecurityExample example);

    int deleteByExample(SecurityExample example);

    int deleteByPrimaryKey(Integer securityid);

    int insert(Security record);

    int insertSelective(Security record);

    List<Security> selectByExample(SecurityExample example);

    Security selectByPrimaryKey(Integer securityid);

    int updateByExampleSelective(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByExample(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByPrimaryKeySelective(Security record);

    int updateByPrimaryKey(Security record);
}
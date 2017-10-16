package com.sds.em.mapper;

import com.sds.em.po.Urlresources;
import com.sds.em.po.UrlresourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UrlresourcesMapper {
    int countByExample(UrlresourcesExample example);

    int deleteByExample(UrlresourcesExample example);

    int deleteByPrimaryKey(Integer resourcesid);

    int insert(Urlresources record);

    int insertSelective(Urlresources record);

    List<Urlresources> selectByExample(UrlresourcesExample example);

    Urlresources selectByPrimaryKey(Integer resourcesid);

    int updateByExampleSelective(@Param("record") Urlresources record, @Param("example") UrlresourcesExample example);

    int updateByExample(@Param("record") Urlresources record, @Param("example") UrlresourcesExample example);

    int updateByPrimaryKeySelective(Urlresources record);

    int updateByPrimaryKey(Urlresources record);
}
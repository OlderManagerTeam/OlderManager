package com.sds.em.mapper;

import com.sds.em.po.Olderproductview;
import com.sds.em.po.OlderproductviewExample;
import com.sds.em.po.Product;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlderproductviewMapper {
    int countByExample(OlderproductviewExample example);

    int deleteByExample(OlderproductviewExample example);

    int deleteByPrimaryKey(Integer productviewid);

    int insert(Olderproductview record);

    int insertSelective(Olderproductview record);

    List<Olderproductview> selectByExample(OlderproductviewExample example);

    Olderproductview selectByPrimaryKey(Integer productviewid);

    int updateByExampleSelective(@Param("record") Olderproductview record, @Param("example") OlderproductviewExample example);

    int updateByExample(@Param("record") Olderproductview record, @Param("example") OlderproductviewExample example);

    int updateByPrimaryKeySelective(Olderproductview record);

    int updateByPrimaryKey(Olderproductview record);
    
	// 老人以登录时，根据老人浏览表 降序排序显示
    public List<Product> repeatedOlderView(int olderid);
}
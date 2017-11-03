package com.sds.em.mapper;

import com.sds.em.po.Producttypetwo;
import com.sds.em.po.ProducttypetwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducttypetwoMapper {
    int countByExample(ProducttypetwoExample example);

    int deleteByExample(ProducttypetwoExample example);

    int deleteByPrimaryKey(Integer typetwoid);

    int insert(Producttypetwo record);

    int insertSelective(Producttypetwo record);

    List<Producttypetwo> selectByExample(ProducttypetwoExample example);

    Producttypetwo selectByPrimaryKey(Integer typetwoid);

    int updateByExampleSelective(@Param("record") Producttypetwo record, @Param("example") ProducttypetwoExample example);

    int updateByExample(@Param("record") Producttypetwo record, @Param("example") ProducttypetwoExample example);

    int updateByPrimaryKeySelective(Producttypetwo record);

    int updateByPrimaryKey(Producttypetwo record);
}
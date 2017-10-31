package com.sds.em.mapper;

import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffbaseMapper {
    int countByExample(StaffbaseExample example);

    int deleteByExample(StaffbaseExample example);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Staffbase record);

    int insertSelective(Staffbase record);

    List<Staffbase> selectByExample(StaffbaseExample example);

    Staffbase selectByPrimaryKey(Integer staffid);

    int updateByExampleSelective(@Param("record") Staffbase record, @Param("example") StaffbaseExample example);

    int updateByExample(@Param("record") Staffbase record, @Param("example") StaffbaseExample example);

    int updateByPrimaryKeySelective(Staffbase record);

    int updateByPrimaryKey(Staffbase record);
    
    //	//返回该部门该职位的员工人数，好形成员工号
    public List<Staffbase> getStaffcodeCount(Staffbase staffbase);
}
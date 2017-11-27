package com.sds.em.mapper;

import com.sds.em.po.Branch;
import com.sds.em.po.BranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchMapper {
    int countByExample(BranchExample example);

    int deleteByExample(BranchExample example);

    int deleteByPrimaryKey(Integer branchid);

    int insert(Branch record);

    int insertSelective(Branch record);

    List<Branch> selectByExample(BranchExample example);

    Branch selectByPrimaryKey(Integer branchid);

    int updateByExampleSelective(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByExample(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);

	List<Branch> brancholdercount();

	List<Branch> branchKPI();
	
	List<Branch> branchactioncount();

	List<Branch> branchactionjoin();

	List<Branch> branchvisit();

	List<Branch> brancholderlevel();
}
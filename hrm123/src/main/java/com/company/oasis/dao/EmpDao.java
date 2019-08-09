package com.company.oasis.dao;

import com.company.oasis.dao.pojo.Emp;

public interface EmpDao {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}
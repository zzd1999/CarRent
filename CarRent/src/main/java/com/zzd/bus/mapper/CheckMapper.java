package com.zzd.bus.mapper;

import com.zzd.bus.pojo.Check;

import java.util.List;

public interface CheckMapper {
    int deleteByPrimaryKey(String checkid);

    int insert(Check record);

    int insertSelective(Check record);

    Check selectByPrimaryKey(String checkid);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);


    //查询
    List<Check> queryAllCheck(Check check);
}
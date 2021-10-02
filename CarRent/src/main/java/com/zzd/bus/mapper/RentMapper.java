package com.zzd.bus.mapper;

import com.zzd.bus.pojo.Rent;

import java.util.List;

public interface RentMapper {

    int deleteByPrimaryKey(String rentid);

    int insert(Rent record);

    int insertSelective(Rent record);

    Rent selectByPrimaryKey(String rentid);

    int updateByPrimaryKeySelective(Rent record);

    int updateByPrimaryKey(Rent record);

    /**
     * @return 查询
     */
    List<Rent> queryAllRent(Rent rent);
}
package com.os.mapper;

import com.os.entity.Table;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TableMapper {
    int deleteByPrimaryKey(Integer tableid);


    int insertSelective(Table record);

    Table selectByPrimaryKey(Integer tableid);

    int updateByPrimaryKeySelective(Table record);


}
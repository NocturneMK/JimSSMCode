package com.wat.ssm.mapper;

import com.wat.ssm.po.People;
import com.wat.ssm.po.PeopleExample;
import com.wat.ssm.po.PeopleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {
    int countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int deleteByPrimaryKey(PeopleKey key);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExample(PeopleExample example);

    People selectByPrimaryKey(PeopleKey key);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}
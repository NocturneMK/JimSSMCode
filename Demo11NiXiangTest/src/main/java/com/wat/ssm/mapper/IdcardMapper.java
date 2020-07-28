package com.wat.ssm.mapper;

import com.wat.ssm.po.Idcard;
import com.wat.ssm.po.IdcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdcardMapper {
    int countByExample(IdcardExample example);

    int deleteByExample(IdcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Idcard record);

    int insertSelective(Idcard record);

    List<Idcard> selectByExample(IdcardExample example);

    Idcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByExample(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByPrimaryKeySelective(Idcard record);

    int updateByPrimaryKey(Idcard record);
}
package com.dou.dao;

import com.dou.domain.Sysparameter;
import com.dou.domain.SysparameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysparameterMapper {
    long countByExample(SysparameterExample example);

    int deleteByExample(SysparameterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysparameter record);

    int insertSelective(Sysparameter record);

    List<Sysparameter> selectByExample(SysparameterExample example);

    Sysparameter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysparameter record, @Param("example") SysparameterExample example);

    int updateByExample(@Param("record") Sysparameter record, @Param("example") SysparameterExample example);

    int updateByPrimaryKeySelective(Sysparameter record);

    int updateByPrimaryKey(Sysparameter record);
}
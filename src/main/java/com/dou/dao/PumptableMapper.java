package com.dou.dao;

import com.dou.domain.Pumptable;
import com.dou.domain.PumptableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumptableMapper {
    long countByExample(PumptableExample example);

    int deleteByExample(PumptableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pumptable record);

    int insertSelective(Pumptable record);

    List<Pumptable> selectByExample(PumptableExample example);

    Pumptable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pumptable record, @Param("example") PumptableExample example);

    int updateByExample(@Param("record") Pumptable record, @Param("example") PumptableExample example);

    int updateByPrimaryKeySelective(Pumptable record);

    int updateByPrimaryKey(Pumptable record);
}
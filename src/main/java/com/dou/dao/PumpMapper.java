package com.dou.dao;

import com.dou.domain.Pump;
import com.dou.domain.PumpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpMapper {
    long countByExample(PumpExample example);

    int deleteByExample(PumpExample example);

    int deleteByPrimaryKey(Integer pumbId);

    int insert(Pump record);

    int insertSelective(Pump record);

    List<Pump> selectByExample(PumpExample example);

    Pump selectByPrimaryKey(Integer pumbId);

    int updateByExampleSelective(@Param("record") Pump record, @Param("example") PumpExample example);

    int updateByExample(@Param("record") Pump record, @Param("example") PumpExample example);

    int updateByPrimaryKeySelective(Pump record);

    int updateByPrimaryKey(Pump record);

	Pump fingPumpbycode(String code);
	//增加水泵信息方法
	int inserPumpbycode(String code);
}
package com.dou.dao;

import com.dou.domain.Pumphistorical;
import com.dou.domain.PumphistoricalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumphistoricalMapper {
    long countByExample(PumphistoricalExample example);

    int deleteByExample(PumphistoricalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pumphistorical record);

    int insertSelective(Pumphistorical record);

    List<Pumphistorical> selectByExample(PumphistoricalExample example);

    Pumphistorical selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pumphistorical record, @Param("example") PumphistoricalExample example);

    int updateByExample(@Param("record") Pumphistorical record, @Param("example") PumphistoricalExample example);

    int updateByPrimaryKeySelective(Pumphistorical record);

    int updateByPrimaryKey(Pumphistorical record);
}
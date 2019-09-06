package com.dou.dao;

import com.dou.domain.Waterhistor;
import com.dou.domain.WaterhistorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterhistorMapper {
    long countByExample(WaterhistorExample example);

    int deleteByExample(WaterhistorExample example);

    int deleteByPrimaryKey(String id);

    int insert(Waterhistor record);

    int insertSelective(Waterhistor record);

    List<Waterhistor> selectByExample(WaterhistorExample example);

    Waterhistor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Waterhistor record, @Param("example") WaterhistorExample example);

    int updateByExample(@Param("record") Waterhistor record, @Param("example") WaterhistorExample example);

    int updateByPrimaryKeySelective(Waterhistor record);

    int updateByPrimaryKey(Waterhistor record);
}
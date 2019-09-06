package com.dou.dao;

import com.dou.domain.Watercock;
import com.dou.domain.WatercockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatercockMapper {
    long countByExample(WatercockExample example);

    int deleteByExample(WatercockExample example);

    int deleteByPrimaryKey(String id);

    int insert(Watercock record);

    int insertSelective(Watercock record);

    List<Watercock> selectByExample(WatercockExample example);

    Watercock selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Watercock record, @Param("example") WatercockExample example);

    int updateByExample(@Param("record") Watercock record, @Param("example") WatercockExample example);

    int updateByPrimaryKeySelective(Watercock record);

    int updateByPrimaryKey(Watercock record);
}
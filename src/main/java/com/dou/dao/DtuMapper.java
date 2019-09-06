package com.dou.dao;

import com.dou.domain.Dtu;
import com.dou.domain.DtuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtuMapper {
    long countByExample(DtuExample example);

    int deleteByExample(DtuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dtu record);

    int insertSelective(Dtu record);

    List<Dtu> selectByExample(DtuExample example);

    Dtu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dtu record, @Param("example") DtuExample example);

    int updateByExample(@Param("record") Dtu record, @Param("example") DtuExample example);

    int updateByPrimaryKeySelective(Dtu record);

    int updateByPrimaryKey(Dtu record);
}
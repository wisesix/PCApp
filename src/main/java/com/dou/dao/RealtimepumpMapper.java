package com.dou.dao;

import com.dou.domain.Realtimepump;
import com.dou.domain.RealtimepumpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealtimepumpMapper {
    long countByExample(RealtimepumpExample example);

    int deleteByExample(RealtimepumpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Realtimepump record);

    int insertSelective(Realtimepump record);

    List<Realtimepump> selectByExample(RealtimepumpExample example);

    Realtimepump selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Realtimepump record, @Param("example") RealtimepumpExample example);

    int updateByExample(@Param("record") Realtimepump record, @Param("example") RealtimepumpExample example);

    int updateByPrimaryKeySelective(Realtimepump record);

    int updateByPrimaryKey(Realtimepump record);
}
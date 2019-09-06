package com.dou.dao;

import com.dou.domain.Loraterminal;
import com.dou.domain.LoraterminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoraterminalMapper {
    long countByExample(LoraterminalExample example);

    int deleteByExample(LoraterminalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Loraterminal record);

    int insertSelective(Loraterminal record);

    List<Loraterminal> selectByExample(LoraterminalExample example);

    Loraterminal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Loraterminal record, @Param("example") LoraterminalExample example);

    int updateByExample(@Param("record") Loraterminal record, @Param("example") LoraterminalExample example);

    int updateByPrimaryKeySelective(Loraterminal record);

    int updateByPrimaryKey(Loraterminal record);
}
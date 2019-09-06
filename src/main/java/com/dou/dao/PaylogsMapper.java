package com.dou.dao;

import com.dou.domain.Paylogs;
import com.dou.domain.PaylogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaylogsMapper {
    long countByExample(PaylogsExample example);

    int deleteByExample(PaylogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Paylogs record);

    int insertSelective(Paylogs record);

    List<Paylogs> selectByExample(PaylogsExample example);

    Paylogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Paylogs record, @Param("example") PaylogsExample example);

    int updateByExample(@Param("record") Paylogs record, @Param("example") PaylogsExample example);

    int updateByPrimaryKeySelective(Paylogs record);

    int updateByPrimaryKey(Paylogs record);
}
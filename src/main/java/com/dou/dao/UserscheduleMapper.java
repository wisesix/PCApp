package com.dou.dao;

import com.dou.domain.Userschedule;
import com.dou.domain.UserscheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserscheduleMapper {
    long countByExample(UserscheduleExample example);

    int deleteByExample(UserscheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userschedule record);

    int insertSelective(Userschedule record);

    List<Userschedule> selectByExample(UserscheduleExample example);

    Userschedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userschedule record, @Param("example") UserscheduleExample example);

    int updateByExample(@Param("record") Userschedule record, @Param("example") UserscheduleExample example);

    int updateByPrimaryKeySelective(Userschedule record);

    int updateByPrimaryKey(Userschedule record);
}
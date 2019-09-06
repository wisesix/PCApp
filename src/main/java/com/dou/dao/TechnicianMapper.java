package com.dou.dao;

import com.dou.domain.Technician;
import com.dou.domain.TechnicianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TechnicianMapper {
    long countByExample(TechnicianExample example);

    int deleteByExample(TechnicianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Technician record);

    int insertSelective(Technician record);

    List<Technician> selectByExample(TechnicianExample example);

    Technician selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Technician record, @Param("example") TechnicianExample example);

    int updateByExample(@Param("record") Technician record, @Param("example") TechnicianExample example);

    int updateByPrimaryKeySelective(Technician record);

    int updateByPrimaryKey(Technician record);
}
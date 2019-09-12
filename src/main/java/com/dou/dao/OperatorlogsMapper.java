package com.dou.dao;

import com.dou.domain.Operatorlogs;
import com.dou.domain.OperatorlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatorlogsMapper {
    long countByExample(OperatorlogsExample example);

    int deleteByExample(OperatorlogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Operatorlogs record);

    int insertSelective(Operatorlogs record);

    List<Operatorlogs> selectByExample(OperatorlogsExample example);

    Operatorlogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Operatorlogs record, @Param("example") OperatorlogsExample example);

    int updateByExample(@Param("record") Operatorlogs record, @Param("example") OperatorlogsExample example);

    int updateByPrimaryKeySelective(Operatorlogs record);

    int updateByPrimaryKey(Operatorlogs record);
    
    
    
    
    List<Operatorlogs> getOperatorList(Operatorlogs operatorlogs);
    
    int updateOperator(Operatorlogs operatorlogs);
    
    //开始时间
    int insertStart(Operatorlogs operatorlogs);
    //结束时间
    int insertEnd(Operatorlogs operatorlogs);
    
    
    
    
}
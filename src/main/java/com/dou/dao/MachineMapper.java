package com.dou.dao;

import com.dou.domain.Machine;
import com.dou.domain.MachineExample;
import com.dou.domain.WXPumpModel;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MachineMapper {
	
	long countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int deleteByPrimaryKey(Integer machineId);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExample(MachineExample example);

    Machine selectByPrimaryKey(Integer machineId);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);

	List<Map<String, Machine>> getMachineList(Machine machine);

	void deleteMachine(Machine machine);

	void updateMachine(Machine machine);
	
	//水栓信息
	int inserMachineinfo(Machine machine);
	
	
	
}
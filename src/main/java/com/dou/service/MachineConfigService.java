package com.dou.service;

import java.util.List;
import java.util.Map;

import com.dou.domain.Machine;
import com.dou.domain.WXPumpModel;

public interface MachineConfigService {
	
	
	public List<Map<String, Machine>> getMachineList(Machine machine);
	
	
	public void deleteMachine(Machine machine);
	
	
	public void updaMachine(Machine machine);
	
	//录入水栓
	int inserMachineinfo(Machine machine);
	//查询水栓
	Machine insertMachineinfo(String phone);
	
}

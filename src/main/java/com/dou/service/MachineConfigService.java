package com.dou.service;

import java.util.List;
import java.util.Map;

import com.dou.domain.Machine;

public interface MachineConfigService {
	
	
	public List<Map<String, Machine>> getMachineList(Machine machine);
	
	
	public void deleteMachine(Machine machine);
	
	
	public void updaMachine(Machine machine);
	
	
	
}

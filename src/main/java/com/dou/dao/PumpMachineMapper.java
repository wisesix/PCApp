package com.dou.dao;

import java.util.List;

import com.dou.domain.PumpMachine;

public interface PumpMachineMapper {
	
	/*PumpMachine pumpmachineinfo(PumpMachine pumpmachine);*/
	
	
	List<PumpMachine> pumpmachineinfo(String phone);

}

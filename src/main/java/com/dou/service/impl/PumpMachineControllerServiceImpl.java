package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.PumpMachineMapper;
import com.dou.domain.PumpMachine;
import com.dou.service.PumpMachineControllerService;

@Service
public class PumpMachineControllerServiceImpl implements PumpMachineControllerService {
	@Autowired
	PumpMachineMapper pumpMachineMapper;
	@Override
	public PumpMachine pumpmachineinfo(PumpMachine pumpmachine) {
		// TODO Auto-generated method stub
		return pumpMachineMapper.pumpmachineinfo(pumpmachine);
	}

	
}
	
	

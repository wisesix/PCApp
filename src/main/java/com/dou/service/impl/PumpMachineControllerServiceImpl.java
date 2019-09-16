package com.dou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.PumpMachineMapper;
import com.dou.domain.PumpMachine;
import com.dou.service.PumpMachineControllerService;

@Service
public class PumpMachineControllerServiceImpl implements PumpMachineControllerService {
	@Autowired
	PumpMachineMapper PumpMachineMapper;

	@Override
	public List<PumpMachine> pumpmachineinfo(String code) {
		// TODO Auto-generated method stub
		return PumpMachineMapper.pumpmachineinfo(code);
	}
	
/*	@Override
	public PumpMachine pumpmachineinfo(PumpMachine pumpmachine) {
		// TODO Auto-generated method stub
		return pumpMachineMapper.pumpmachineinfo(pumpmachine);
	}
*/
	
}
	
	

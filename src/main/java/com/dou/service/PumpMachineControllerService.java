package com.dou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dou.domain.PumpMachine;


@Service
public interface PumpMachineControllerService {
	/*PumpMachine pumpmachineinfo(PumpMachine pumpmachine);*/

	
	List<PumpMachine> pumpmachineinfo(String code);
	
	
	
	
}



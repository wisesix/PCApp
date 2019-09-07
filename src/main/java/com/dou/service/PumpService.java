package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.Pump;

@Service
public interface PumpService {
	
	
	public Pump fingPumpbycode(String code);
	
	public int inserPumpbycode(String code);
	
	
	
}

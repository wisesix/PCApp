package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.StartCharg;

@Service
public interface StartChargService {
	
	
	StartCharg getStartCharg(String machinecde);
}

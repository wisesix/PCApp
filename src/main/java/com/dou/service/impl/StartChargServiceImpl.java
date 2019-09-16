package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.StartChargMapper;
import com.dou.domain.StartCharg;
import com.dou.service.StartChargService;

@Service
public class StartChargServiceImpl implements StartChargService{
	
	@Autowired
	StartChargMapper StartChargMapper;
	
	@Override
	public StartCharg getStartCharg(String machinecde) {
		// TODO Auto-generated method stub
		return StartChargMapper.getStartCharg(machinecde);
	}

}

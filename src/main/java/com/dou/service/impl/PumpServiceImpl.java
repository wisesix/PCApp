package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.PumpMapper;
import com.dou.domain.Pump;
import com.dou.service.PumpService;

@Service
public class PumpServiceImpl implements PumpService{
	
	@Autowired
	private PumpMapper PumpMapper;
	
	
	@Override
	public Pump fingPumpbycode(String code) {
		// TODO Auto-generated method stub
		return PumpMapper.fingPumpbycode(code);
	}

}

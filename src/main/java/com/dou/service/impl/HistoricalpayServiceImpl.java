package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.HistoricalpayMapper;
import com.dou.domain.Historicalpay;
import com.dou.service.HistoricalpayService;

@Service
public class HistoricalpayServiceImpl implements HistoricalpayService{
	
	
	@Autowired
	HistoricalpayMapper HistoricalpayMapper;
	
	
	@Override
	public Historicalpay selectHistoricalpayinfo(String phone) {
		// TODO Auto-generated method stub
		return HistoricalpayMapper.selectHistoricalpayinfo(phone);
	}

}

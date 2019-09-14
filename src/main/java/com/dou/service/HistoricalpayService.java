package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.Historicalpay;

@Service
public interface HistoricalpayService {
	
	Historicalpay selectHistoricalpayinfo(String phone);
	
}

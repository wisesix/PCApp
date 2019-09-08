package com.dou.service;

import com.dou.domain.WXPumpModel;



public interface WXInserPumpSercice {
	
	//录入水泵
	int inserPumpbycode(WXPumpModel wXPumpModel);
	//查询水泵
	WXPumpModel insertPumpinfo(String phone);
	
	
}

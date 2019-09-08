package com.dou.service;

import com.dou.domain.WXPumpModel;



public interface WXInserPumpSercice {
	
	
	int inserPumpbycode(WXPumpModel wXPumpModel);
	
	WXPumpModel inserPumpinfo(String code);
	
	
}

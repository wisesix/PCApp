package com.dou.dao;

import com.dou.domain.WXPumpModel;

public interface WXPumpMapper {
	
	int inserPumpinfo(WXPumpModel wXPumpModel);
	
	WXPumpModel inserPumpinfo(String code);
}

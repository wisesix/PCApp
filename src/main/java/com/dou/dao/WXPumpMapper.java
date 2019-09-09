package com.dou.dao;

import com.dou.domain.WXPumpModel;

public interface WXPumpMapper {
	//录入水泵
	int inserPumpinfo(WXPumpModel wXPumpModel);
	//获取水泵信息
	WXPumpModel insertPumpinfo(String phone);
	
}

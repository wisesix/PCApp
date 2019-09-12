package com.dou.dao;

import com.dou.domain.WXPumpModel;

public interface WXPumpMapper {
	
	//录入水泵
	int inserPumpinfo(WXPumpModel wXPumpModel);
	
	//获取水泵信息
	WXPumpModel insertPumpinfo(String phone);
	
	//折线统计图
	WXPumpModel selectZhexian(String code);
	
	//控制方式设置
	int getControlmode(WXPumpModel wXPumpModel);
	
}

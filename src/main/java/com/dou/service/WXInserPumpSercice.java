package com.dou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dou.domain.WXPumpModel;


@Service
public interface WXInserPumpSercice {
	
	//录入水泵
	int inserPumpbycode(WXPumpModel wXPumpModel);
	
	//查询水泵
	List<WXPumpModel> insertPumpinfo(String phone);
	
	//折线统计图
	List<WXPumpModel> selectZhexian(String code);
	
	//控制方式设置
	int getControlmode(WXPumpModel wXPumpModel);
	
	
}

package com.dou.dao;

import java.util.List;

import com.dou.domain.WXMonitorinfo;

public interface WXMonitorinfoMapper {
	
	
	
	
	 List<WXMonitorinfo> selectWXMonitorinfo(String phone);
	
	
}

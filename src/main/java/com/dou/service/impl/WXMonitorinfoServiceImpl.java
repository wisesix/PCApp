package com.dou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.WXMonitorinfoMapper;
import com.dou.domain.WXMonitorinfo;
import com.dou.service.WXMonitorinfoService;
@Service
public class WXMonitorinfoServiceImpl implements WXMonitorinfoService{
	
	@Autowired
	WXMonitorinfoMapper WXMonitorinfoMapper;

	@Override
	public List<WXMonitorinfo> selectWXMonitorinfo(String phone) {
		// TODO Auto-generated method stub
		return WXMonitorinfoMapper.selectWXMonitorinfo(phone);
	}
	

}

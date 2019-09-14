package com.dou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dou.domain.WXMonitorinfo;

@Service
public interface WXMonitorinfoService {
	
	List<WXMonitorinfo> selectWXMonitorinfo(String phone);
}

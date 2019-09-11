package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.Userinfo;

@Service
public interface WXUserinfoService {
	
	
	//查询用户信息
	Userinfo inserUserinfoinfo(String phone);
	
}

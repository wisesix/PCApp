package com.dou.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.UserinfoMapper;
import com.dou.domain.Userinfo;
import com.dou.service.WXUserinfoService;


@Service
public class WXUserinfoServiceImpl implements WXUserinfoService{
	
	@Autowired
	UserinfoMapper UserinfoMapper;
	
	
	@Override
	public Userinfo inserUserinfoinfo(String phone) {
		// TODO Auto-generated method stub
		return UserinfoMapper.inserUserinfoinfo(phone);
	}
	

}

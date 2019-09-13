package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.WxUserMapper;
import com.dou.domain.WxUserModel;
import com.dou.service.WxUserService;
@Service
public class WxUserServiceImpl implements WxUserService{
	
	@Autowired
	WxUserMapper WxUserMapper;
	
	
	@Override
	public WxUserModel selectWxUserModel(String phone) {
		// TODO Auto-generated method stub
		return WxUserMapper.selectWxUserModel(phone);
	}

}

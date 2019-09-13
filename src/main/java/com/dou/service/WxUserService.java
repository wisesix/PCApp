package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.WxUserModel;
@Service
public interface WxUserService {

	// 获取用户首页信息
	WxUserModel selectWxUserModel(String phone);

}

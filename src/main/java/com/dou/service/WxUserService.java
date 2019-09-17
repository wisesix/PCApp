package com.dou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dou.domain.WxUserModel;
@Service
public interface WxUserService {

	// 获取用户首页信息
	List<WxUserModel> selectWxUserModel(String phone);

}

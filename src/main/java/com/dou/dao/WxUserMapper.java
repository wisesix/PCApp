package com.dou.dao;

import com.dou.domain.WxUserModel;

public interface WxUserMapper {

	// 获取用户首页信息
	WxUserModel selectWxUserModel(String phone);

}

package com.dou.dao;

import java.util.List;

import com.dou.domain.WxUserModel;

public interface WxUserMapper {

	// 获取用户首页信息
	List<WxUserModel> selectWxUserModel(String phone);

}

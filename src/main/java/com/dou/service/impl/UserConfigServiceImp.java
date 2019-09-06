package com.dou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.UserConfigDao;
import com.dou.domain.Userinfo;
import com.dou.service.UserConfigService;

@Service
public class UserConfigServiceImp implements UserConfigService {

	@Autowired
	private UserConfigDao UserConfigdao;
	
	public List<Map<String, Userinfo>> getUserList(Userinfo user) {
		return UserConfigdao.getUserList(user);
	}
	
	
	public void addUser(Userinfo user) {
		UserConfigdao.addUser(user);
	}


	public void deleteUser(Userinfo user) {
		UserConfigdao.deleteUser(user);		
	}


	public void updateUser(Userinfo user) {
		UserConfigdao.updateUser(user);
	}

}

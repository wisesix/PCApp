package com.dou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.UserinfoMapper;
import com.dou.domain.Userinfo;
import com.dou.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserinfoMapper userinfoMapper;
	
	public List<Userinfo> getALLUserinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveuserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		
	}

	public Boolean checkUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserinfo(Integer user_id) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 		֤
	 */
	public Userinfo findUserByName(String name) {
		// TODO Auto-generated method stub
		return userinfoMapper.findUserByName(name);
	}

	
}

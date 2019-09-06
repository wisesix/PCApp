package com.dou.service;

import java.util.List;

import com.dou.domain.Userinfo;

public interface UserService {
	
	public List<Userinfo> getALLUserinfo();
	
	void saveuserinfo(Userinfo userinfo);
	
	Boolean checkUserName(String userName);
	
	void updateUserinfo(Userinfo userinfo);
	
	void deleteUserinfo(Integer user_id);

	public Userinfo findUserByName(String name);

}

package com.dou.service;

import java.util.List;
import java.util.Map;

import com.dou.domain.Machine;
import com.dou.domain.Userinfo;

public interface UserConfigService {
	
	
	/**
	 * 	
	 * @return
	 */
	public List<Map<String, Userinfo>> getUserList(Userinfo user);
	/**
	 *  
	 * @param user
	 */
	public void addUser(Userinfo user);
	
	//
	public void deleteUser(Userinfo user);
	
	//
	public void updateUser(Userinfo user);
	
	

}

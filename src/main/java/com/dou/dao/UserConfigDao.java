package com.dou.dao;

import java.util.List;
import java.util.Map;

import com.dou.domain.Userinfo;

public interface UserConfigDao {
	
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

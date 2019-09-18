package com.dou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.UserTestMapper;
import com.dou.domain.UserTest;
import com.dou.service.UserTestService;
@Service
public class UserTestServiceImpl implements UserTestService{
	
	@Autowired
	UserTestMapper UserTestMapper;
	
	
	
	@Override
	public List<UserTest> getUserTest(Integer id) {
		// TODO Auto-generated method stub
		return UserTestMapper.getUserTest(id);
	}

	
	
	
}

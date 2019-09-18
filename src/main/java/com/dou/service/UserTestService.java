package com.dou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dou.domain.UserTest;
@Service
public interface UserTestService {
	
	
	List<UserTest> getUserTest(Integer id);
}

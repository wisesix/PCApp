package com.dou.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.OpenMPMapper;
import com.dou.domain.OpenMP;
import com.dou.service.OpenMPService;

@Service
public class OpenMPServiceImpl implements OpenMPService{
	
	@Autowired
	OpenMPMapper OpenMPMapper;

	@Override
	public void insertOpenMP(OpenMP openMP) {
		// TODO Auto-generated method stub
		OpenMPMapper.insertOpenMP(openMP);
	}

	@Override
	public void selectOpenMP(OpenMP openMP) {
		// TODO Auto-generated method stub
		OpenMPMapper.selectOpenMP(openMP);
	}


}

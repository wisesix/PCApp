package com.dou.dao;


import com.dou.domain.OpenMP;

public interface OpenMPMapper {
	
	//小程序端向数据库传值，水泵、水栓状态（开）
	void insertOpenMP(OpenMP openMP);
	
	//查询水泵、水栓状态为0时返回给小程序（关）
	void selectOpenMP(OpenMP openMP);

}

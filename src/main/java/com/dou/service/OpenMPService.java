package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.OpenMP;

@Service
public interface OpenMPService {
	// 小程序端向数据库传值，水泵、水栓状态（开）
	void insertOpenMP(OpenMP openMP);

	// 查询水泵、水栓状态为0时返回给小程序（关）
	OpenMP selectOpenMP(OpenMP openMP);
}

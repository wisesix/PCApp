package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.Operatorlogs;
@Service
public interface WXOperatorlogsService {
	
	//开始时间
	int insertStart(Operatorlogs operatorlogs);
	//结束时间
	int insertEnd(Operatorlogs operatorlogs);
	
}

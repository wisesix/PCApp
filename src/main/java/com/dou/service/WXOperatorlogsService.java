package com.dou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dou.domain.Operatorlogs;
@Service
public interface WXOperatorlogsService {
	
	//开始时间
	int insertStart(Operatorlogs operatorlogs);
	//结束时间
	int insertEnd(Operatorlogs operatorlogs);
	
	
	
	List<Operatorlogs> getOperatorList(Operatorlogs operatorlogs);
	
	int updateOperator(Operatorlogs operatorlogs);
	
}

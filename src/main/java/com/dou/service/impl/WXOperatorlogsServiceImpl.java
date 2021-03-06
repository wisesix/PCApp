package com.dou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.OperatorlogsMapper;
import com.dou.domain.Operatorlogs;
import com.dou.service.WXOperatorlogsService;
@Service
public class WXOperatorlogsServiceImpl implements WXOperatorlogsService{
	
	
	@Autowired
	OperatorlogsMapper OperatorlogsMapper;
	
	//开始时间
	@Override
	public int insertStart(Operatorlogs operatorlogs) {
		// TODO Auto-generated method stub
		return OperatorlogsMapper.insertStart(operatorlogs);
	}
	//结束时间
	@Override
	public int insertEnd(Operatorlogs operatorlogs) {
		// TODO Auto-generated method stub
		return OperatorlogsMapper.insertEnd(operatorlogs);
	}
	@Override
	public List<Operatorlogs> getOperatorList(Operatorlogs operatorlogs) {
		// TODO Auto-generated method stub
		return OperatorlogsMapper.getOperatorList(operatorlogs);
	}
	@Override
	public int updateOperator(Operatorlogs operatorlogs) {
		// TODO Auto-generated method stub
		return OperatorlogsMapper.updateOperator(operatorlogs);
	}
	
	
}

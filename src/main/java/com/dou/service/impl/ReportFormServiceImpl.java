package com.dou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.ReportFormMapper;
import com.dou.domain.ReportForm;
import com.dou.service.ReportFormService;

@Service
public class ReportFormServiceImpl implements ReportFormService{
	
	@Autowired
	ReportFormMapper ReportFormMapper;
	
	@Override
	public List<ReportForm> selectReportForminfo(ReportForm reportForm) {
		// TODO Auto-generated method stub
		return ReportFormMapper.selectReportForminfo(reportForm);
	}

}

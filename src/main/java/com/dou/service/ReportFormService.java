package com.dou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dou.domain.ReportForm;
@Service
public interface ReportFormService {
	
	
	// 数据统计方法
	List<ReportForm> selectReportForminfo(ReportForm reportForm);
}

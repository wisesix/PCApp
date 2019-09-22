package com.dou.dao;

import java.util.List;

import com.dou.domain.ReportForm;

public interface ReportFormMapper {
	//数据统计方法
	List<ReportForm> selectReportForminfo(ReportForm reportForm);

}

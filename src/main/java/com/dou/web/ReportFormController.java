package com.dou.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dou.domain.ReportForm;
import com.dou.service.ReportFormService;

@Controller
@RequestMapping("/reportform")
public class ReportFormController {
		
	@Autowired
	ReportFormService reportFormService;
	
	@ResponseBody
	@RequestMapping("/shuju")
	public String shuju(Map<String, Object> map, HttpServletRequest re, ReportForm reportForm) {
		List<ReportForm> listr = reportFormService.selectReportForminfo(reportForm);
		System.err.println("reportForm" + reportForm.getCode());
		System.err.println("reportForm" + reportForm.getMachinecde());
		map.put("listr", listr);
		return "map";

	}
	
	
}

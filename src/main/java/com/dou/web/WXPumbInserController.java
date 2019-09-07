package com.dou.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Pump;
import com.dou.service.PumpService;

@RestController
@RequestMapping(value = "/inserpump")
public class WXPumbInserController {
	
	@Autowired
	private PumpService pumpService;
	
	@RequestMapping(value = "/getpump")
	@ResponseBody
	public void getpump(HttpServletRequest request,PrintWriter printWriter,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		String code = request.getParameter("code");
		System.out.println(code);
		if(!StringUtils.isBlank(code) && !StringUtils.isBlank(code)) {
			int pump = pumpService.inserPumpbycode(code);
					map.put("res", code);
				}
			}
	
	}
	
	

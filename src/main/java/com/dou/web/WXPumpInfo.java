package com.dou.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Userinfo;
import com.dou.domain.WXPumpModel;
import com.dou.service.WXInserPumpSercice;
import com.dou.service.WXUserinfoService;

@Controller
@RequestMapping("/pumpinfo")
public class WXPumpInfo {
	
	@Autowired
	private WXInserPumpSercice wXInserPumpSercice;

	@RequestMapping(value = "/info", method = { RequestMethod.GET })
	@ResponseBody
	public void info(HttpServletRequest request,PrintWriter printWriter,HttpSession session) {

		WXPumpModel pump = wXInserPumpSercice.insertPumpinfo(request.getParameter("phone"));

		
		printWriter.write(JSON.toJSONString(pump));
	}
	
	
	
	@RequestMapping(value = "/zhexian", 
			method = { RequestMethod.GET }, 
			produces = "application/json; charset=utf-8")
	@ResponseBody
	public void zhexian(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {

		WXPumpModel pump = wXInserPumpSercice.selectZhexian(request.getParameter("code"));
		printWriter.write(JSON.toJSONString(pump));
	}
	
	
	
	
	
	
	
}

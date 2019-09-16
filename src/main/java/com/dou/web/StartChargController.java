package com.dou.web;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.StartCharg;
import com.dou.service.StartChargService;

@Controller
@RequestMapping("/startcharg")
public class StartChargController {
		
	@Autowired
	StartChargService startChargService;
	
	@RequestMapping(value = "/jifei")
	@ResponseBody
	public void info(HttpServletRequest request,PrintWriter printWriter,HttpSession session) throws ParseException {
		
		
		 

		StartCharg sh = startChargService.getStartCharg(request.getParameter("machinecde"));

		
		printWriter.write(JSON.toJSONString(sh));
	}
	
	
	
}

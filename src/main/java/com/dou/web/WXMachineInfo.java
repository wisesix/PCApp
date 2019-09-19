package com.dou.web;
/**
 * 水栓信息
 */
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Machine;
import com.dou.domain.WXPumpModel;
import com.dou.service.MachineConfigService;
import com.dou.service.WXInserPumpSercice;

@Controller
@RequestMapping("/machineinfo")
public class WXMachineInfo {
	
	@Autowired
	MachineConfigService machineConfigService;
	
	@RequestMapping(value = "/info", method = { RequestMethod.GET },produces = "application/json; charset=utf-8")
	@ResponseBody
	public void info(HttpServletRequest request,PrintWriter printWriter,HttpSession session) {

		List<Machine> machine = machineConfigService.insertMachineinfo(request.getParameter("phone"));
		
		printWriter.write(JSON.toJSONString(machine));
	}
}

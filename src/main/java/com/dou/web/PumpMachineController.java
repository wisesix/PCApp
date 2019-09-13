package com.dou.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.PumpMachine;
import com.dou.service.PumpMachineControllerService;

@Controller
@RequestMapping("/PumpMachine")
public class PumpMachineController {
	@Autowired
	 private PumpMachineControllerService pumpMachineControllerService;

	@ResponseBody
	@RequestMapping("/PumpMachineinfo")
	public void start(PumpMachine pumpMachine, HttpServletRequest request, PrintWriter printWriter, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);

		pumpMachine.setCodestatus(0);
		
		map.put("res", pumpMachineControllerService.pumpmachineinfo(pumpMachine));

		printWriter.write(JSON.toJSONString(map));
	}
	
	
	
	
}

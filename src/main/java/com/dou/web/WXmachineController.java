package com.dou.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dou.domain.Machine;
import com.dou.service.MachineConfigService;

@Controller
@RequestMapping("/wechatmachine")
public class WXmachineController {
	
	@Autowired
	MachineConfigService MachineConfigService;
	
	@ResponseBody
	@RequestMapping(value = "/machineinfo")
	public String myinfo(Machine model, HttpSession session) {
		System.out.println("*******************************");
		Machine machine = new Machine();
		machine.setMachineId(11);
		machine.setMachinecde("55");
		machine.setCode("22");
		return machine.toString();
		
	}
	
	
	
}

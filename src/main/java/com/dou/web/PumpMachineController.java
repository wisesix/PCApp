package com.dou.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.PumpMachine;
import com.dou.domain.WXPumpModel;
import com.dou.domain.WxUserModel;
import com.dou.service.PumpMachineControllerService;
import com.dou.utils.ResponseData;
import com.dou.utils.ResponseRowsData;

@Controller
@RequestMapping("/pumpmachine")
public class PumpMachineController {
	@Autowired
	PumpMachineControllerService pumpMachineControllerService;

	@RequestMapping(value = "/info", 
			method = { RequestMethod.POST })
	@ResponseBody
	public List<PumpMachine> info(HttpServletRequest request) {
		
		List<PumpMachine> pm = pumpMachineControllerService.pumpmachineinfo(request.getParameter("code"));
		
		System.out.println("pm" + pm);
	
		
		return pm;
	}
	
	
	
	
}

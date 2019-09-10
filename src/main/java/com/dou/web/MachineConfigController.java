package com.dou.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dou.domain.Machine;
import com.dou.service.MachineConfigService;


@Controller
@RequestMapping("/UserConfig")
public class MachineConfigController {
	@Autowired	
	MachineConfigService machineConfigService;
	
	@RequestMapping("/getMachineList.do")
	public String getUserList(Map<String, Object> map, HttpServletRequest re) {
		
		List<Map<String, Machine>> list = machineConfigService.getMachineList(null);
		map.put("list", list);
		return "imgtable";
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
}

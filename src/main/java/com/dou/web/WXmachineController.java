package com.dou.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Machine;
import com.dou.service.MachineConfigService;

@Controller
@RequestMapping("/wechatmachine")
public class WXmachineController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	MachineConfigService MachineConfigService;
	
	@ResponseBody
	@RequestMapping(value = "/machineinfo", method = { RequestMethod.POST })
	public void machineinfo(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		Machine machine = new Machine();
		machine.setCode(request.getParameter("code"));
		machine.setMachinecde(request.getParameter("machinecde"));
		machine.setCaliber(request.getParameter("caliber"));

		map.put("res", MachineConfigService.inserMachineinfo(machine));

		printWriter.write(JSON.toJSONString(map));
	}
	/**
	 * 	电磁阀状态
	 * @param request
	 * @param printWriter
	 * @param session
	 */
	
	@RequestMapping(value = "/getelelocksta")
	@ResponseBody
	public void getelelocksta(HttpServletRequest request,PrintWriter printWriter,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("elelocksta", 0);
		String machinecde = request.getParameter("machinecde");
		System.out.println(machinecde);
		if(!StringUtils.isBlank(machinecde) && !StringUtils.isBlank(machinecde)) {
			Machine machine = MachineConfigService.insertElelockstainfo(machinecde);
			if(machine!=null) {
				if(machine.getMachinecde().equals(machinecde)) {
					map.put("elelocksta", 1);
				}
			}
		}
		printWriter.write(JSON.toJSONString(map));
	}
	
	/**
	 * 	手动阀状态
	 * @param request
	 * @param printWriter
	 * @param session
	 */

	@RequestMapping(value = "/getvalvesta")
	@ResponseBody
	public void getvalvesta(HttpServletRequest request,PrintWriter printWriter,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("valvesta", 0);
		String machinecde = request.getParameter("machinecde");
		System.out.println(machinecde);
		if(!StringUtils.isBlank(machinecde) && !StringUtils.isBlank(machinecde)) {
			Machine machine = MachineConfigService.insertValvestainfo(machinecde);
			if(machine!=null) {
				if(machine.getMachinecde().equals(machinecde)) {
					map.put("valvesta", 1);
				}
			}
		}
		printWriter.write(JSON.toJSONString(map));
	}
	
	
	
}

package com.dou.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.dou.domain.Ocpm;
import com.dou.service.OcpmService;

@Controller
@RequestMapping("/pumpmachine")
public class OcpmController {

	@Autowired
	OcpmService ocpmService;

	/*
	 * 开栓向数据库存
	 */
	@RequestMapping(value = "/info")
	@ResponseBody
	public void info(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		String machinecde = request.getParameter("machinecde");
		System.out.println(machinecde);
		System.out.println("8888888888888");
		if (!StringUtils.isBlank(machinecde) && !StringUtils.isBlank(machinecde)) {
			ocpmService.openOcpminfo(machinecde);
			map.put("res", 1);
		}
		printWriter.write(JSON.toJSONString(map));
	}

	/*
	 * 关向数据库存
	 */
	@RequestMapping(value = "/closepm")
	@ResponseBody
	public void closepm(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		String machinecde = request.getParameter("machinecde");
		System.out.println(machinecde);
		if (!StringUtils.isBlank(machinecde) && !StringUtils.isBlank(machinecde)) {
			ocpmService.closeOcpminfo(machinecde);
			map.put("res", 1);
		}
		printWriter.write(JSON.toJSONString(map));
	}

	/*
	 * 给前台传硬件开栓返回的值
	 */
	@RequestMapping(value = "/fopenpm")
	@ResponseBody
	public Ocpm fopenpm(HttpServletRequest request) {
		Ocpm ocpm = ocpmService.fopenOcpminfo(request.getParameter("machinecde"));
		System.out.println("pm" + ocpm);
		return ocpm;
	}

	/*
	 * 给前台传硬件关栓返回的值
	 */
	@RequestMapping(value = "/fclosepm")
	@ResponseBody
	public Ocpm fclosepm(HttpServletRequest request) {
		Ocpm pm = ocpmService.fcloseOcpminfo(request.getParameter("machinecde"));
		System.out.println("pm" + pm);
		return pm;
	}
}


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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dou.domain.Pump;
import com.dou.domain.Userinfo;
import com.dou.domain.WXPumpModel;
import com.dou.service.WXInserPumpSercice;

@Controller
@RequestMapping("/pump")
public class WXInserPumpController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private WXInserPumpSercice wXInserPumpSercice;

	@RequestMapping(value = "/inserpump", method = { RequestMethod.POST })
	@ResponseBody
	public void inserpump(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		WXPumpModel pump = new WXPumpModel();
		pump.setCode(request.getParameter("code"));
		pump.setPhone(request.getParameter("phone"));
		pump.setVoltage(request.getParameter("voltage"));
		pump.setCurrent(request.getParameter("current"));
		pump.setPower(request.getParameter("power"));
		pump.setLift(request.getParameter("lift"));
		
		pump.setControlmode("1");
		pump.setVillagers("西安");
		pump.setCumulativeflow("0");
		pump.setCumruntime(0);

		map.put("res", wXInserPumpSercice.inserPumpbycode(pump));

		printWriter.write(JSON.toJSONString(map));
	}
	
	
	
	
	
	@RequestMapping(value = "/controlmode", method = { RequestMethod.POST })
	@ResponseBody
	public void controlmode(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		WXPumpModel pump = new WXPumpModel();
		pump.setCode(request.getParameter("code"));
		pump.setControlmode(request.getParameter("controlmode"));

		map.put("res", wXInserPumpSercice.getControlmode(pump));

		printWriter.write(JSON.toJSONString(map));
	}
}

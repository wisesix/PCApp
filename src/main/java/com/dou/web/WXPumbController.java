package com.dou.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Pump;
import com.dou.domain.Userinfo;
import com.dou.service.PumpService;

@RestController
@RequestMapping(value = "/weixinpump")
public class WXPumbController {
	@Autowired
	private PumpService pumpService;
	
	@RequestMapping(value = "/getpump")
	@ResponseBody
	public void getpump(PrintWriter printWriter,String code,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		if(!StringUtils.isBlank(code) && !StringUtils.isBlank(code)) {
			Pump pump = pumpService.fingPumpbycode(code);
			System.out.println("////////////////////////////////");
			if(pump!=null) {
				if(pump.getCode().equals(code)) {
					map.put("res", 1);
				}
			}
		}
		printWriter.write(JSON.toJSONString(map));
	}
	
	
}

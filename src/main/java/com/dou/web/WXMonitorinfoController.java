package com.dou.web;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.text.StrTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.WXMonitorinfo;
import com.dou.service.WXMonitorinfoService;

@Controller
@RequestMapping("/monitorinfo")
public class WXMonitorinfoController {
	
	@Autowired
	WXMonitorinfoService wXMonitorinfoService;
	
	@RequestMapping(value = "/info", method = { RequestMethod.GET })
	@ResponseBody
	public void info(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {

		List<WXMonitorinfo> monitor = wXMonitorinfoService.selectWXMonitorinfo(request.getParameter("phone"));
		List<Map<String, Object>> resultList = new ArrayList<Map<String,Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		List<Integer> mechinecodes = new ArrayList<Integer>();
		map.put("machinecde", mechinecodes);
		resultList.add(map);
		
		printWriter.write(JSON.toJSONString(monitor));
	}
	
}

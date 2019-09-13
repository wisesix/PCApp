package com.dou.web;

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
import com.dou.domain.WXPumpModel;
import com.dou.service.WXInserPumpSercice;
import com.dou.utils.ResponseData;
import com.dou.utils.ResponseRowsData;

@Controller
@RequestMapping("/pumpinfo")
public class WXPumpInfo {
	
	@Autowired
	private WXInserPumpSercice wXInserPumpSercice;

	@RequestMapping(value = "/info", method = { RequestMethod.GET })
	@ResponseBody
	public void info(HttpServletRequest request,PrintWriter printWriter,HttpSession session) {

		List<WXPumpModel> pump = wXInserPumpSercice.insertPumpinfo(request.getParameter("phone"));

		
		printWriter.write(JSON.toJSONString(pump));
	}
	
	
	
	@RequestMapping(value = "/zhexian", 
			method = { RequestMethod.POST }, 
			produces = "application/json; charset=utf-8")
	@ResponseBody
	public ResponseData zhexian(HttpServletRequest request) {
		
		ResponseData data = new ResponseData();
		List<WXPumpModel> pump = wXInserPumpSercice.selectZhexian(request.getParameter("code"));
		 ResponseRowsData rows = new ResponseRowsData();
	        rows.setResult(pump);
	        rows.setTotal((long) pump.size());
	        data.setData(rows);
		return data;
	}
	
	
	
	
	
	
	
}

package com.dou.web;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Machine;
import com.dou.domain.Userinfo;
import com.dou.domain.WXPumpModel;
import com.dou.service.MachineConfigService;
import com.dou.service.UserConfigService;
import com.dou.service.WXInserPumpSercice;
import com.dou.service.WXUserinfoService;

@Controller
@RequestMapping("/userinfo")
public class WXUserInfo {

	@Autowired
	WXUserinfoService wXUserinfoService;

	@RequestMapping(value = "/uinfo", method = { RequestMethod.GET },  produces = "application/json; charset=utf-8")
	@ResponseBody
	public void uinfo(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {

		Userinfo user = wXUserinfoService.inserUserinfoinfo(request.getParameter("phone"));
		printWriter.write(JSON.toJSONString(user));
		
	}

}

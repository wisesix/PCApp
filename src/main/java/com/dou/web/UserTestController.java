package com.dou.web;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.UserTest;
import com.dou.domain.WXPumpModel;
import com.dou.service.UserTestService;


@Controller
@RequestMapping("/getuser")
public class UserTestController {
	
	@Autowired
	UserTestService userTestService;
	@ResponseBody
	@RequestMapping("/test")
	public List<UserTest> test(HttpServletRequest request,HttpSession session) {
		
		int id = Integer.valueOf(request.getParameter("id").toString());
		List<UserTest> ut = userTestService.getUserTest(id);

		return ut;
	}
	
	
}

package com.dou.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dou.domain.UserTest;
import com.dou.service.UserTestService;


@Controller
@RequestMapping("/getuser")
public class UserTestController {
	
	@Autowired
	UserTestService userTestService;
	@ResponseBody
	@RequestMapping("/test")
	public String test(HttpServletRequest request,HttpSession session,Map<String, Object> map) {
		
		int id = Integer.valueOf(request.getParameter("id").toString());
		List<UserTest> ut = userTestService.getUserTest(id);
		System.out.println("6666666666666");
		map.put("ut", ut);
		return "test.jsp";
	}
	
	
}

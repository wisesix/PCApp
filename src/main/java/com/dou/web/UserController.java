package com.dou.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dou.domain.Userinfo;
import com.dou.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Userinfo model, HttpSession session) {
		System.out.println(model.getPassword() + "@@@@@@");
		Userinfo user = userService.findUserByName(model.getName());
		System.out.println("name:" + model.getName());
		System.out.println("password:" + model.getPassword());
		if (user == null) {
			return "redirect:/error.jsp";
		}else if(!user.getPassword().equals(model.getPassword())){
			return "redirect:/error.jsp";
		}else {
			System.out.println("user.getPassword():" + user.getPassword());
			session.setAttribute("user", user);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("login");
			return "login";	
		}
		 
	}


}
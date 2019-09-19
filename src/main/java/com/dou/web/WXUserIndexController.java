package com.dou.web;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.WxUserModel;
import com.dou.service.WxUserService;

/**
 * 用户首页信息
 * 
 * @author Dell
 *
 */

@Controller
@RequestMapping("/userindex")
public class WXUserIndexController {

	@Autowired
	WxUserService wxUserService;

	@RequestMapping(value = "/homeinfo", method = { RequestMethod.GET }, produces = "application/json; charset=utf-8")
	@ResponseBody
	public void homeinfo(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {

		List<WxUserModel> user = wxUserService.selectWxUserModel(request.getParameter("phone"));

		printWriter.write(JSON.toJSONString(user));
	}

}

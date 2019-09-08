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
import com.dou.domain.Userinfo;
import com.dou.service.UserService;
/*
 * 	小程序登录接口
 */
@RestController
@RequestMapping(value = "/weixinuser")
public class WXUserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/getuser")
	@ResponseBody
	public void getUser(PrintWriter printWriter,String userName,String passWord, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		if(!StringUtils.isBlank(userName) && !StringUtils.isBlank(passWord)) {
			Userinfo user = userService.findUserByName(userName);
			if(user!=null) {
				if(user.getPassword().equals(passWord)) {
					map.put("res", 1);
				}
			}
		}
		printWriter.write(JSON.toJSONString(map));
	}

}
package com.dou.web;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dou.domain.Userinfo;
import com.dou.service.UserConfigService;

@Controller
@RequestMapping("/userConfig")
public class UserConfigController {

	@Autowired
	private UserConfigService userConfigService;

	/**
	 * 查询
	 * 
	 */

	@RequestMapping("/getUserList.do")
	public String getUserList(Map<String, Object> map, HttpServletRequest re) {
		List<Map<String, Userinfo>> list = userConfigService.getUserList(null);
		map.put("list", list);
		return "rightResult";

	}

	@RequestMapping("/toAddUser.do")
	public String toAddUser() {
		System.out.println("----------------------------------");
		return "page/addUser";
	}

	/**
	 * 	添加
	 */

	@RequestMapping("/addUser.do")
	@ResponseBody
	public String addUser(Map<String, Object> map, Userinfo User, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("2222222222222");
		String name = request.getParameter("addname");
		String ldnumber = request.getParameter("addldnumber");
		String password = request.getParameter("addpassword");
		String phone = request.getParameter("addphone");
		String machinecde = request.getParameter("addmachinecde");
		String code = request.getParameter("addcode");
		String addr = request.getParameter("addaddr");
		String picture = "";

		User.setAddr(addr);
		User.setCode(code);
		User.setLdnumber(ldnumber);
		User.setMachinecde(machinecde);
		User.setName(name);
		User.setPassword(password);
		User.setPhone(phone);
		User.setPicture(picture);
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");

		System.out.println(name);

		try {
			System.out.println("---------------111");
			userConfigService.addUser(User);
			return "OK";
		} catch (Exception e) {
			return "ERROR";

		}

	}

	
	@RequestMapping("/deleteUser.do")
	@ResponseBody
	public String deleteUser(Map<String, Object> map, Userinfo user) {
		System.out.println(user.getUserId()+"111111111111");
		try {
			userConfigService.deleteUser(user);
			map.put("1", "删除成功");
		} catch (Exception e) {
			map.put("0", "删除失败");

		}
		return null;

	}
	
	
	@RequestMapping("toUpdatepage.do")
	public String toUpdatepage(Map<String, Object> map,Integer userId){
		System.out.println(userId);
		Userinfo user = new Userinfo();
		user.setUserId(userId);
		List<Map<String, Userinfo>> list = userConfigService.getUserList(user);
		System.out.println(list.get(0));
		map.put("list", list);
		return "page/updateUser";
	}
	
	
	
	

	/**
	 * 更新
	 */
	@ResponseBody
	@RequestMapping("/updateUser.do")
	public String updateUser(Map<String, Object> map, Userinfo User, HttpServletRequest request,
			HttpServletResponse response,Integer uid) {
		
		System.out.println("2222222222222");
		System.out.println(uid);
		String name = request.getParameter("editname");
		String ldnumber = request.getParameter("editldnumber");
		String password = request.getParameter("editpassword");
		String phone = request.getParameter("editphone");
		String machinecde = request.getParameter("editmachinecde");
		String code = request.getParameter("editcode");
		String addr = request.getParameter("editaddr");
		String picture = "";
		
		User.setUserId(uid);
		User.setAddr(addr);
		User.setCode(code);
		User.setLdnumber(ldnumber);
		User.setMachinecde(machinecde);
		User.setName(name);
		User.setPassword(password);
		User.setPhone(phone);
		User.setPicture(picture);
		
		System.out.println(User);
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");

		System.out.println(name);
		
		try {
			userConfigService.updateUser(User);
			return "OK";
		} catch (Exception e) {
			return "ERROR";

		}
	}
		
		
		
		
	

}
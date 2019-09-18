package com.dou.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.OpenMP;
import com.dou.service.OpenMPService;

@Controller
@RequestMapping("/openmp")
public class OpenMPController {

	@Autowired
	OpenMPService openMPService;

	@ResponseBody
	@RequestMapping("/mpopen")
	public String mpopen(OpenMP openMP) {

		try {
			openMPService.insertOpenMP(openMP);
			return "ok";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
	}

	@ResponseBody
	@RequestMapping("/mpclose")
	public void mpclose(HttpServletRequest request, OpenMP openMP) {
		OpenMP mp = openMPService.selectOpenMP(openMP);

	}

}

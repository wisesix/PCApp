package com.dou.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
			System.out.println("开栓报错:" + e.getMessage());
			return "error";
		}
	}

	@ResponseBody
	@RequestMapping("/mpclose")
	public String mpclose(OpenMP openMP) {

		try {
			openMPService.selectOpenMP(openMP);;
			return "ok";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("关栓报错:" + e.getMessage());
			return "error";
		}
	}

}

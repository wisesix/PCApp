package com.dou.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Historicalpay;
import com.dou.service.HistoricalpayService;

@Controller
@RequestMapping("Historicalpay")
public class HistoricalpayController {

	@Autowired
	HistoricalpayService historicalpayService;

	@RequestMapping(value = "/info", method = { RequestMethod.GET }, produces = "application/json; charset=utf-8")
	@ResponseBody
	public void info(HttpServletRequest request, PrintWriter printWriter, HttpSession session) {

		Historicalpay historicalpay = historicalpayService.selectHistoricalpayinfo(request.getParameter("phone"));
		printWriter.write(JSON.toJSONString(historicalpay));
	}

}

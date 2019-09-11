package com.dou.web;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dou.domain.Operatorlogs;
import com.dou.service.WXOperatorlogsService;

@Controller
@RequestMapping("/operatorlogs")
public class WXOperatorlogsController {

	@Autowired
	WXOperatorlogsService wXOperatorlogsService;

	@RequestMapping(value = "/start")
	@ResponseBody
	public void start(HttpServletRequest request, PrintWriter printWriter, HttpSession session) throws ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		Operatorlogs operatorlogs = new Operatorlogs();

		String startTime = request.getParameter("start");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
		Date date = df.parse(startTime);

		operatorlogs.setStart(date);

		map.put("res", wXOperatorlogsService.insertStart(operatorlogs));

		printWriter.write(JSON.toJSONString(map));
	}

	@RequestMapping(value = "/end")
	@ResponseBody
	public void end(HttpServletRequest request, PrintWriter printWriter, HttpSession session) throws ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		Operatorlogs operatorlogs = new Operatorlogs();

		String endTime = request.getParameter("end");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
		Date date = df.parse(endTime);

		operatorlogs.setEnd(date);

		map.put("res", wXOperatorlogsService.insertEnd(operatorlogs));

		printWriter.write(JSON.toJSONString(map));
	}

}

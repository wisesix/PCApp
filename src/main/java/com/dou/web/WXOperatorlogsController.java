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
import com.dou.utils.DateUtil;

@Controller
@RequestMapping("/operatorlogs")
public class WXOperatorlogsController {

	@Autowired
	WXOperatorlogsService wXOperatorlogsService;

	@RequestMapping(value = "/start")
	@ResponseBody
	public void start(Operatorlogs operatorlogs, HttpServletRequest request, PrintWriter printWriter, HttpSession session) throws ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);

		/*
		 * String startTime = request.getParameter("start"); SimpleDateFormat df = new
		 * SimpleDateFormat("yyyy-MM-dd  hh:mm:ss"); Date date = df.parse(startTime);
		 */

		operatorlogs.setStart(new Date());
		operatorlogs.setStatus(0);
		
		map.put("res", wXOperatorlogsService.insertStart(operatorlogs));

		printWriter.write(JSON.toJSONString(map));
	}

	
	
	
	
	@RequestMapping(value = "/end")
	@ResponseBody
	public void end(Operatorlogs operatorlogs,HttpServletRequest request, PrintWriter printWriter, HttpSession session) throws ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", 0);
		operatorlogs.setStatus(0);
		Operatorlogs operatorlogs2 = wXOperatorlogsService.getOperatorList(operatorlogs).get(0);
        Integer realtime = DateUtil.differMinute(new Date(), operatorlogs2.getStart());
		operatorlogs2.setEnd(new Date());
		operatorlogs2.setStatus(1);
		operatorlogs2.setRealtime(realtime);
		map.put("res", wXOperatorlogsService.updateOperator(operatorlogs2));
		printWriter.write(JSON.toJSONString(map));
	}

}

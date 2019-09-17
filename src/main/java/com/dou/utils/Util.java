package com.dou.utils;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

public class Util {

	public static String getRandomStringByLength(int length) {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
	public static String getIpAddr(HttpServletRequest request) {
		 String ip = request.getHeader("X-Forwarded-For");
         if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
        	 int index = ip.indexOf(",");
        	 if(index != -1){
        		 return ip.substring(0,index); 
        		 }else{ 
        			 return ip;
        			 }
        	 }
         ip = request.getHeader("X-Real-IP");
         if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){ 
        	 return ip;
        }
        return request.getRemoteAddr();
        }
}

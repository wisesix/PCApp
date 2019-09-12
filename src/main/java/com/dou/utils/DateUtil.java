package com.dou.utils;

import java.util.Date;

/**
 * 
 */
public final class DateUtil {
 
    
	/*
	 * public static void main(String[] args) {
	 * 
	 * DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); Date date1=new
	 * Date(); try { Date date2 = df.parse("2019-09-10 13:31:40");
	 * System.out.println(differTime(date1, date2));
	 * System.out.println(differMinute(date1, date2)); } catch (ParseException e) {
	 * e.printStackTrace(); }
	 * 
	 * System.out.println(); }
	 */

    public static String differTime(Date date1,Date date2) {
    	long diff = date1.getTime() - date2.getTime();//这样得到的差值是微秒级别
        long days = diff / (1000 * 60 * 60 * 24);
        long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
        long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
        String differtime=""+days+"天"+hours+"小时"+minutes+"分";
    	return differtime;
    }
    public static Integer differMinute(Date date1,Date date2) {
    	long diff = date1.getTime() - date2.getTime();//这样得到的差值是微秒级别
    	long days = diff / (1000 * 60 * 60 * 24);
	    long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
	    long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
        Integer differtime=(int) (days*24*60+hours*60+minutes);
    	return differtime;
    }
}

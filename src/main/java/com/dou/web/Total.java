package com.dou.web;

public class Total {

	public static void main(String[] args) {
		
		
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();

		long time = end - start;

		long second = time / 1000;
		long mimis = time / 1000 / 60;
		long hour = time / 1000 / (60 * 60);

		
		System.out.println(hour);
		System.out.println(mimis);
		System.out.println(second);

	}

}

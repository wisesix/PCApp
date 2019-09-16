package com.dou.domain;

public class JiFei {
	
	//浇灌时间
	private  Integer realtime;
	//单价
	private float price;
	//合计
	private float total;
	
	private String phone;
	
	
	
	
	

	@Override
	public String toString() {
		return "JiFei [realtime=" + realtime + ", price=" + price + ", total=" + total + ", phone=" + phone + "]";
	}

	public Integer getRealtime() {
		return realtime;
	}

	public void setRealtime(Integer realtime) {
		this.realtime = realtime;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
}

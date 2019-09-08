package com.dou.domain;

public class WXPumpModel {
	
	
	private String id;
	
	private String phone;
	
	private String code;
	
	private String voltage;
	
	private String current;
	
	private String power;
	
	private String lift;
	
	
	
	
	@Override
	public String toString() {
		return "WXPumpModel [id=" + id + ", phone=" + phone + ", code=" + code + ", voltage=" + voltage + ", current="
				+ current + ", power=" + power + ", lift=" + lift + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getLift() {
		return lift;
	}

	public void setLift(String lift) {
		this.lift = lift;
	}

	
	
	
	
}

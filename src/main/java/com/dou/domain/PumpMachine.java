package com.dou.domain;

public class PumpMachine {
	
	private String usestatus;
	
	private String codestatus;
	private String code;
	private String machinecde;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	private String phone;
	
	public String getUsestatus() {
		return usestatus;
	}
	public void setUsestatus(String usestatus) {
		this.usestatus = usestatus;
	}
	public String getCodestatus() {
		return codestatus;
	}
	public void setCodestatus(String codestatus) {
		this.codestatus = codestatus;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "PumpMachine [usestatus=" + usestatus + ", codestatus=" + codestatus + ", phone=" + phone + "]";
	}
	
	

}

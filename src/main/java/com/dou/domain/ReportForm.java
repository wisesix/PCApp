package com.dou.domain;
/**
 * 	数据统计
 * @author Dell
 *
 */
public class ReportForm {
	
	private Integer id;
	private String code;
	private String machinecde;
	private String villagers;
	private String dtu;
	private String dtuport;
	private String voltage;
	private String current;
	private String power;
	
	
	@Override
	public String toString() {
		return "ReportForm [id=" + id + ", code=" + code + ", machinecde=" + machinecde + ", villagers=" + villagers
				+ ", dtu=" + dtu + ", dtuport=" + dtuport + ", voltage=" + voltage + ", current=" + current + ", power="
				+ power + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMachinecde() {
		return machinecde;
	}
	public void setMachinecde(String machinecde) {
		this.machinecde = machinecde;
	}
	public String getVillagers() {
		return villagers;
	}
	public void setVillagers(String villagers) {
		this.villagers = villagers;
	}
	public String getDtu() {
		return dtu;
	}
	public void setDtu(String dtu) {
		this.dtu = dtu;
	}
	public String getDtuport() {
		return dtuport;
	}
	public void setDtuport(String dtuport) {
		this.dtuport = dtuport;
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
	
	
	
}

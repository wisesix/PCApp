package com.dou.domain;


public class WXPumpModel {

	private String id;

	private String phone;
	// 水泵编码
	private String code;
	// 电压
	private String voltage;
	// 电流
	private String current;
	// 功率
	private String power;

	private String lift;

	// 瞬时流量
	private String sflow;
	// 出水压力
	private String pressure;
	// 控制方式
	private String controlmode;

	private String time;
	// 地理位置
	private String villagers;

	private String cumulativeflow;

	private int cumruntime;
	
	
	
	
	
	@Override
	public String toString() {
		return "WXPumpModel [id=" + id + ", phone=" + phone + ", code=" + code + ", voltage=" + voltage + ", current="
				+ current + ", power=" + power + ", lift=" + lift + ", sflow=" + sflow + ", pressure=" + pressure
				+ ", controlmode=" + controlmode + ", time=" + time + ", villagers=" + villagers + ", cumulativeflow="
				+ cumulativeflow + ", cumruntime=" + cumruntime + "]";
	}

	public String getVillagers() {
		return villagers;
	}

	public void setVillagers(String villagers) {
		this.villagers = villagers;
	}

	public String getCumulativeflow() {
		return cumulativeflow;
	}

	public void setCumulativeflow(String cumulativeflow) {
		this.cumulativeflow = cumulativeflow;
	}

	public int getCumruntime() {
		return cumruntime;
	}

	public void setCumruntime(int cumruntime) {
		this.cumruntime = cumruntime;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getControlmode() {
		return controlmode;
	}

	public void setControlmode(String controlmode) {
		this.controlmode = controlmode;
	}

	public String getSflow() {
		return sflow;
	}

	public void setSflow(String sflow) {
		this.sflow = sflow;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
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

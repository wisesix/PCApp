package com.dou.domain;

public class Machine {

	private Integer id;

	private String machinecde;

	private String plugspec;

	private String code;

	private Integer usestatus;
	// 电压
	private Float voltage;
	// 电流
	private Float current;
	// 功率
	private Float power;

	private String dtu;

	private String dtuport;

	private String devicepeople;

	private String localcoding;
	// 电磁锁状态
	private String elelocksta;
	// 手动阀状态
	private String valvesta;

	private String caliber;

	private String mcodestatus;

	private String cumruntime;

	private String phone;
	// 浇灌时间
	private Integer realtime;
	// 压力
	private String pressure;

	
	@Override
	public String toString() {
		return "Machine [id=" + id + ", machinecde=" + machinecde + ", plugspec=" + plugspec + ", code=" + code
				+ ", usestatus=" + usestatus + ", voltage=" + voltage + ", current=" + current + ", power=" + power
				+ ", dtu=" + dtu + ", dtuport=" + dtuport + ", devicepeople=" + devicepeople + ", localcoding="
				+ localcoding + ", elelocksta=" + elelocksta + ", valvesta=" + valvesta + ", caliber=" + caliber
				+ ", mcodestatus=" + mcodestatus + ", cumruntime=" + cumruntime + ", phone=" + phone + ", realtime="
				+ realtime + ", pressure=" + pressure + "]";
	}

	public Integer getRealtime() {
		return realtime;
	}

	public void setRealtime(Integer realtime) {
		this.realtime = realtime;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getMcodestatus() {
		return mcodestatus;
	}

	public void setMcodestatus(String mcodestatus) {
		this.mcodestatus = mcodestatus;
	}

	public String getCumruntime() {
		return cumruntime;
	}

	public void setCumruntime(String cumruntime) {
		this.cumruntime = cumruntime;
	}

	public String getCaliber() {
		return caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMachinecde() {
		return machinecde;
	}

	public void setMachinecde(String machinecde) {
		this.machinecde = machinecde == null ? null : machinecde.trim();
	}

	public String getPlugspec() {
		return plugspec;
	}

	public void setPlugspec(String plugspec) {
		this.plugspec = plugspec == null ? null : plugspec.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public Integer getUsestatus() {
		return usestatus;
	}

	public void setUsestatus(Integer usestatus) {
		this.usestatus = usestatus;
	}

	public Float getVoltage() {
		return voltage;
	}

	public void setVoltage(Float voltage) {
		this.voltage = voltage;
	}

	public Float getCurrent() {
		return current;
	}

	public void setCurrent(Float current) {
		this.current = current;
	}

	public Float getPower() {
		return power;
	}

	public void setPower(Float power) {
		this.power = power;
	}

	public String getDtu() {
		return dtu;
	}

	public void setDtu(String dtu) {
		this.dtu = dtu == null ? null : dtu.trim();
	}

	public String getDtuport() {
		return dtuport;
	}

	public void setDtuport(String dtuport) {
		this.dtuport = dtuport == null ? null : dtuport.trim();
	}

	public String getDevicepeople() {
		return devicepeople;
	}

	public void setDevicepeople(String devicepeople) {
		this.devicepeople = devicepeople == null ? null : devicepeople.trim();
	}

	public String getLocalcoding() {
		return localcoding;
	}

	public void setLocalcoding(String localcoding) {
		this.localcoding = localcoding == null ? null : localcoding.trim();
	}

	public String getElelocksta() {
		return elelocksta;
	}

	public void setElelocksta(String elelocksta) {
		this.elelocksta = elelocksta;
	}

	public String getValvesta() {
		return valvesta;
	}

	public void setValvesta(String valvesta) {
		this.valvesta = valvesta;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

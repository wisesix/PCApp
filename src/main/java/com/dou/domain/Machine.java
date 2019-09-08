package com.dou.domain;

public class Machine {

	private Integer id;

	private String machinecde;

	private String plugspec;

	private String code;

	private Integer usestatus;

	private Float voltage;

	private Float current;

	private Float power;

	private String dtu;

	private String dtuport;

	private String devicepeople;

	private String localcoding;

	private Integer elelocksta;

	private Integer valvesta;

	private String caliber;

	
	
	@Override
	public String toString() {
		return "Machine [id=" + id + ", machinecde=" + machinecde + ", plugspec=" + plugspec + ", code=" + code
				+ ", usestatus=" + usestatus + ", voltage=" + voltage + ", current=" + current + ", power=" + power
				+ ", dtu=" + dtu + ", dtuport=" + dtuport + ", devicepeople=" + devicepeople + ", localcoding="
				+ localcoding + ", elelocksta=" + elelocksta + ", valvesta=" + valvesta + ", caliber=" + caliber
				+ ", getCaliber()=" + getCaliber() + ", getId()=" + getId() + ", getMachinecde()=" + getMachinecde()
				+ ", getPlugspec()=" + getPlugspec() + ", getCode()=" + getCode() + ", getUsestatus()=" + getUsestatus()
				+ ", getVoltage()=" + getVoltage() + ", getCurrent()=" + getCurrent() + ", getPower()=" + getPower()
				+ ", getDtu()=" + getDtu() + ", getDtuport()=" + getDtuport() + ", getDevicepeople()="
				+ getDevicepeople() + ", getLocalcoding()=" + getLocalcoding() + ", getElelocksta()=" + getElelocksta()
				+ ", getValvesta()=" + getValvesta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
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

	public Integer getElelocksta() {
		return elelocksta;
	}

	public void setElelocksta(Integer elelocksta) {
		this.elelocksta = elelocksta;
	}

	public Integer getValvesta() {
		return valvesta;
	}

	public void setValvesta(Integer valvesta) {
		this.valvesta = valvesta;
	}
}
package com.dou.domain;
/**
 * 	监控信息
 * @author Dell
 *
 */

public class WXMonitorinfo {
	//电压
	private Float uab;
	private Float ubc;
	private Float uca;
	//电流
	private Float ia;
	private Float ib;
	private Float ic;
	//出水量
	private Float lflow;
	//压力
	private String tension;
	//频率
	private String frequency;
	//水泵编码
	private String code;
	//运行状态
	private String codestatus;
	//控制方式
	private String controlmode;
	//水栓编码
	private String machinecde;
	//运行状态
	private String usestatus;
	
	private String phone;
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Float getUab() {
		return uab;
	}
	public void setUab(Float uab) {
		this.uab = uab;
	}
	public Float getUbc() {
		return ubc;
	}
	public void setUbc(Float ubc) {
		this.ubc = ubc;
	}
	public Float getUca() {
		return uca;
	}
	public void setUca(Float uca) {
		this.uca = uca;
	}
	public Float getIa() {
		return ia;
	}
	public void setIa(Float ia) {
		this.ia = ia;
	}
	public Float getIb() {
		return ib;
	}
	public void setIb(Float ib) {
		this.ib = ib;
	}
	public Float getIc() {
		return ic;
	}
	public void setIc(Float ic) {
		this.ic = ic;
	}
	public Float getLflow() {
		return lflow;
	}
	public void setLflow(Float lflow) {
		this.lflow = lflow;
	}
	public String getTension() {
		return tension;
	}
	public void setTension(String tension) {
		this.tension = tension;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodestatus() {
		return codestatus;
	}
	public void setCodestatus(String codestatus) {
		this.codestatus = codestatus;
	}
	public String getControlmode() {
		return controlmode;
	}
	public void setControlmode(String controlmode) {
		this.controlmode = controlmode;
	}
	public String getMachinecde() {
		return machinecde;
	}
	public void setMachinecde(String machinecde) {
		this.machinecde = machinecde;
	}
	public String getMcodestatus() {
		return usestatus;
	}
	public void setMcodestatus(String mcodestatus) {
		this.usestatus = mcodestatus;
	}
	@Override
	public String toString() {
		return "WXMonitorinfo [uab=" + uab + ", ubc=" + ubc + ", uca=" + uca + ", ia=" + ia + ", ib=" + ib + ", ic="
				+ ic + ", lflow=" + lflow + ", tension=" + tension + ", frequency=" + frequency + ", code=" + code
				+ ", codestatus=" + codestatus + ", controlmode=" + controlmode + ", machinecde=" + machinecde
				+ ", mcodestatus=" + usestatus + "]";
	}
	
	
	
	
	
}

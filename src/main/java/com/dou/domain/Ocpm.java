package com.dou.domain;

public class Ocpm {

	private Integer id;
	// 水泵编码
	private String code;
	// 水栓编码
	private String machinecde;
	// 小程序开栓请求打开泵
	private String openpump;
	// 小程序开栓请求打开栓
	private String openmachine;
	// 硬件返回开泵信息
	private String fopenpump;
	// 硬件返回开栓信息
	private String fopenmachine;
	
	// 小程序关栓请求关闭泵
	private String closepump;
	// 小程序关栓请求关闭栓
	private String closemachine;
	// 硬件返回关泵信息
	private String fclosepump;
	// 硬件返回关栓信息
	private String fclosemachine;
	// 水泵状态
	private String codestatus;
	// 1#水栓状态
	private String usestatusA;

	private String phone;

	@Override
	public String toString() {
		return "Ocpm [id=" + id + ", code=" + code + ", machinecde=" + machinecde + ", openpump=" + openpump
				+ ", openmachine=" + openmachine + ", fopenpump=" + fopenpump + ", fopenmachine=" + fopenmachine
				+ ", closepump=" + closepump + ", closemachine=" + closemachine + ", fclosepump=" + fclosepump
				+ ", fclosemachine=" + fclosemachine + ", codestatus=" + codestatus + ", usestatusA=" + usestatusA
				+ ", phone=" + phone + "]";
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

	public String getOpenpump() {
		return openpump;
	}

	public void setOpenpump(String openpump) {
		this.openpump = openpump;
	}

	public String getOpenmachine() {
		return openmachine;
	}

	public void setOpenmachine(String openmachine) {
		this.openmachine = openmachine;
	}

	public String getFopenpump() {
		return fopenpump;
	}

	public void setFopenpump(String fopenpump) {
		this.fopenpump = fopenpump;
	}

	public String getFopenmachine() {
		return fopenmachine;
	}

	public void setFopenmachine(String fopenmachine) {
		this.fopenmachine = fopenmachine;
	}

	public String getClosepump() {
		return closepump;
	}

	public void setClosepump(String closepump) {
		this.closepump = closepump;
	}

	public String getClosemachine() {
		return closemachine;
	}

	public void setClosemachine(String closemachine) {
		this.closemachine = closemachine;
	}

	public String getFclosepump() {
		return fclosepump;
	}

	public void setFclosepump(String fclosepump) {
		this.fclosepump = fclosepump;
	}

	public String getFclosemachine() {
		return fclosemachine;
	}

	public void setFclosemachine(String fclosemachine) {
		this.fclosemachine = fclosemachine;
	}

	public String getCodestatus() {
		return codestatus;
	}

	public void setCodestatus(String codestatus) {
		this.codestatus = codestatus;
	}

	public String getUsestatusA() {
		return usestatusA;
	}

	public void setUsestatusA(String usestatusA) {
		this.usestatusA = usestatusA;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

package com.dou.domain;

public class OpenMP {

	// 水泵状态
	private String codestatus;
	// 水栓状态
	private String usestatusA;
	// 水泵编码
	private String code;
	// 水栓编码
	private String machinecde;
	// 水泵控制模式
	private String controlmode;

	private String phone;

	@Override
	public String toString() {
		return "OpenMP [codestatus=" + codestatus + ", usestatusA=" + usestatusA + ", code=" + code + ", machinecde="
				+ machinecde + ", controlmode=" + controlmode + ", phone=" + phone + "]";
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

	public String getControlmode() {
		return controlmode;
	}

	public void setControlmode(String controlmode) {
		this.controlmode = controlmode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

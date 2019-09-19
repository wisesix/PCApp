package com.dou.domain;

public class PumpMachine {

	private String usestatusA;
	private String usestatusB;
	private String usestatusC;
	private String controlmode;

	private String codestatus;
	private String code;
	private String machinecde;

	

	@Override
	public String toString() {
		return "PumpMachine [usestatusA=" + usestatusA + ", usestatusB=" + usestatusB + ", usestatusC=" + usestatusC
				+ ", controlmode=" + controlmode + ", codestatus=" + codestatus + ", code=" + code + ", machinecde="
				+ machinecde + "]";
	}

	public String getControlmode() {
		return controlmode;
	}

	public void setControlmode(String controlmode) {
		this.controlmode = controlmode;
	}

	public String getUsestatusA() {
		return usestatusA;
	}

	public void setUsestatusA(String usestatusA) {
		this.usestatusA = usestatusA;
	}

	public String getUsestatusB() {
		return usestatusB;
	}

	public void setUsestatusB(String usestatusB) {
		this.usestatusB = usestatusB;
	}

	public String getUsestatusC() {
		return usestatusC;
	}

	public void setUsestatusC(String usestatusC) {
		this.usestatusC = usestatusC;
	}

	public String getCodestatus() {
		return codestatus;
	}

	public void setCodestatus(String codestatus) {
		this.codestatus = codestatus;
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

}

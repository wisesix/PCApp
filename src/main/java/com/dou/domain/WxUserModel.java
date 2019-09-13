package com.dou.domain;

import java.util.Date;

/**
 * 农户首页信息字段模型
 * 
 * @author Dell
 *
 */
public class WxUserModel {
	// 水泵编码
	private String code;
	// 运行状态
	private String codestatus;
	// 水泵控制方式
	private String controlmode;
	// 水栓编码
	private String machinecde;
	// 运行状态
	private String usestatus;
	// 累计浇灌时间
	private Date cumtime;
	// 累计消费金额
	private float cumamount;
	// 累计用水量
	private String cumwater;
	// 账户余额
	private String staus;

	private String phone;

	@Override
	public String toString() {
		return "WxUserModel [code=" + code + ", codestatus=" + codestatus + ", controlmode=" + controlmode
				+ ", machinecde=" + machinecde + ", usestatus=" + usestatus + ", cumtime=" + cumtime + ", cumamount="
				+ cumamount + ", cumwater=" + cumwater + ", staus=" + staus + ", phone=" + phone + "]";
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

	public String getUsestatus() {
		return usestatus;
	}

	public void setUsestatus(String usestatus) {
		this.usestatus = usestatus;
	}

	public Date getCumtime() {
		return cumtime;
	}

	public void setCumtime(Date cumtime) {
		this.cumtime = cumtime;
	}

	public float getCumamount() {
		return cumamount;
	}

	public void setCumamount(float cumamount) {
		this.cumamount = cumamount;
	}

	public String getCumwater() {
		return cumwater;
	}

	public void setCumwater(String cumwater) {
		this.cumwater = cumwater;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

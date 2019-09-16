package com.dou.domain;

import java.util.Date;

public class StartCharg {

	private String machinecde;
	// 手动阀状态
	private String valvesta;
	// 已灌溉时间
	private Date irrtime;
	// 已用水量
	private String watersum;
	// 已用金额
	private float amountspent;
	// 水流量
	private String insflowrate;

	@Override
	public String toString() {
		return "StartCharg [machinecde=" + machinecde + ", valvesta=" + valvesta + ", irrtime=" + irrtime
				+ ", watersum=" + watersum + ", amountspent=" + amountspent + ", insflowrate=" + insflowrate + "]";
	}

	public String getMachinecde() {
		return machinecde;
	}

	public void setMachinecde(String machinecde) {
		this.machinecde = machinecde;
	}

	public String getValvesta() {
		return valvesta;
	}

	public void setValvesta(String valvesta) {
		this.valvesta = valvesta;
	}

	public Date getIrrtime() {
		return irrtime;
	}

	public void setIrrtime(Date irrtime) {
		this.irrtime = irrtime;
	}

	public String getWatersum() {
		return watersum;
	}

	public void setWatersum(String watersum) {
		this.watersum = watersum;
	}

	public float getAmountspent() {
		return amountspent;
	}

	public void setAmountspent(float amountspent) {
		this.amountspent = amountspent;
	}

	public String getInsflowrate() {
		return insflowrate;
	}

	public void setInsflowrate(String insflowrate) {
		this.insflowrate = insflowrate;
	}

}

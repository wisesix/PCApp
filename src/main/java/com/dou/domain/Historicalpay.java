package com.dou.domain;

import java.util.Date;

public class Historicalpay {

	// 商户id
	private String buid;
	// 充值时间
	private Date time;
	// 充值金额
	private float money;
	// 用水量
	private String watersum;
	// 开始时间
	private Date start;
	// 结束时间
	private Date end;

	private String phone;

	@Override
	public String toString() {
		return "Historicalpay [buid=" + buid + ", time=" + time + ", money=" + money + ", watersum=" + watersum
				+ ", start=" + start + ", end=" + end + ", phone=" + phone + "]";
	}

	public String getBuid() {
		return buid;
	}

	public void setBuid(String buid) {
		this.buid = buid;
	}


	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getWatersum() {
		return watersum;
	}

	public void setWatersum(String watersum) {
		this.watersum = watersum;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

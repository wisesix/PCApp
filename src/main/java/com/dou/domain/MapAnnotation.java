package com.dou.domain;

public class MapAnnotation {
	
	
	
	private String code;
	//经度
	private Float longitude;
	//纬度
	private Float latitude;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Map [code=" + code + ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	
	
	
	
	
}

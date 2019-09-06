package com.dou.domain;

import java.util.Date;

public class Loraterminal {
    private Integer id;

    private Date refreshtime;

    private Integer address;

    private Integer di01;

    private Integer di02;

    private Integer di03;

    private Integer di04;

    private Integer d001;

    private Integer d002;

    private Integer d003;

    private Integer d004;

    private Float ai01;

    private Float ai02;

    private Float a001;

    private Float a002;

    private Integer c1D001;

    private Integer c1D002;

    private Integer c0D001;

    private Integer c0D002;

    private Float sflow;

    private Float lflow;

    private Integer dtuid;

    private String lng;

    private String lat;

    private String name;

    private Float batteryvoltage;

    private Float terminaltemperature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Date refreshtime) {
        this.refreshtime = refreshtime;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getDi01() {
        return di01;
    }

    public void setDi01(Integer di01) {
        this.di01 = di01;
    }

    public Integer getDi02() {
        return di02;
    }

    public void setDi02(Integer di02) {
        this.di02 = di02;
    }

    public Integer getDi03() {
        return di03;
    }

    public void setDi03(Integer di03) {
        this.di03 = di03;
    }

    public Integer getDi04() {
        return di04;
    }

    public void setDi04(Integer di04) {
        this.di04 = di04;
    }

    public Integer getD001() {
        return d001;
    }

    public void setD001(Integer d001) {
        this.d001 = d001;
    }

    public Integer getD002() {
        return d002;
    }

    public void setD002(Integer d002) {
        this.d002 = d002;
    }

    public Integer getD003() {
        return d003;
    }

    public void setD003(Integer d003) {
        this.d003 = d003;
    }

    public Integer getD004() {
        return d004;
    }

    public void setD004(Integer d004) {
        this.d004 = d004;
    }

    public Float getAi01() {
        return ai01;
    }

    public void setAi01(Float ai01) {
        this.ai01 = ai01;
    }

    public Float getAi02() {
        return ai02;
    }

    public void setAi02(Float ai02) {
        this.ai02 = ai02;
    }

    public Float getA001() {
        return a001;
    }

    public void setA001(Float a001) {
        this.a001 = a001;
    }

    public Float getA002() {
        return a002;
    }

    public void setA002(Float a002) {
        this.a002 = a002;
    }

    public Integer getC1D001() {
        return c1D001;
    }

    public void setC1D001(Integer c1D001) {
        this.c1D001 = c1D001;
    }

    public Integer getC1D002() {
        return c1D002;
    }

    public void setC1D002(Integer c1D002) {
        this.c1D002 = c1D002;
    }

    public Integer getC0D001() {
        return c0D001;
    }

    public void setC0D001(Integer c0D001) {
        this.c0D001 = c0D001;
    }

    public Integer getC0D002() {
        return c0D002;
    }

    public void setC0D002(Integer c0D002) {
        this.c0D002 = c0D002;
    }

    public Float getSflow() {
        return sflow;
    }

    public void setSflow(Float sflow) {
        this.sflow = sflow;
    }

    public Float getLflow() {
        return lflow;
    }

    public void setLflow(Float lflow) {
        this.lflow = lflow;
    }

    public Integer getDtuid() {
        return dtuid;
    }

    public void setDtuid(Integer dtuid) {
        this.dtuid = dtuid;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getBatteryvoltage() {
        return batteryvoltage;
    }

    public void setBatteryvoltage(Float batteryvoltage) {
        this.batteryvoltage = batteryvoltage;
    }

    public Float getTerminaltemperature() {
        return terminaltemperature;
    }

    public void setTerminaltemperature(Float terminaltemperature) {
        this.terminaltemperature = terminaltemperature;
    }
}
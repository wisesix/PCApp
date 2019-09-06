package com.dou.domain;

public class Pumphistorical {
    private Integer id;

    private String code;

    private String actualcurrent;

    private String voltage;

    private String insfiowrate;

    private String cumulativeflow;

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
        this.code = code == null ? null : code.trim();
    }

    public String getActualcurrent() {
        return actualcurrent;
    }

    public void setActualcurrent(String actualcurrent) {
        this.actualcurrent = actualcurrent == null ? null : actualcurrent.trim();
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage == null ? null : voltage.trim();
    }

    public String getInsfiowrate() {
        return insfiowrate;
    }

    public void setInsfiowrate(String insfiowrate) {
        this.insfiowrate = insfiowrate == null ? null : insfiowrate.trim();
    }

    public String getCumulativeflow() {
        return cumulativeflow;
    }

    public void setCumulativeflow(String cumulativeflow) {
        this.cumulativeflow = cumulativeflow == null ? null : cumulativeflow.trim();
    }
}
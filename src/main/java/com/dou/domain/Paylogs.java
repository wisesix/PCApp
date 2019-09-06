package com.dou.domain;

import java.util.Date;

public class Paylogs {
    private Integer id;

    private String name;

    private String idnumber;

    private String machinecde;

    private Date time;

    private Double money;

    private Double staus;

    private Date ptime;

    private Double pmoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getMachinecde() {
        return machinecde;
    }

    public void setMachinecde(String machinecde) {
        this.machinecde = machinecde == null ? null : machinecde.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getStaus() {
        return staus;
    }

    public void setStaus(Double staus) {
        this.staus = staus;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public Double getPmoney() {
        return pmoney;
    }

    public void setPmoney(Double pmoney) {
        this.pmoney = pmoney;
    }
}
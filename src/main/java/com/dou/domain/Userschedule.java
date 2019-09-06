package com.dou.domain;

import java.util.Date;

public class Userschedule {
    private Integer id;

    private String machinecde;

    private Date plantime;

    private Date realrime;

    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachinecde() {
        return machinecde;
    }

    public void setMachinecde(String machinecde) {
        this.machinecde = machinecde == null ? null : machinecde.trim();
    }

    public Date getPlantime() {
        return plantime;
    }

    public void setPlantime(Date plantime) {
        this.plantime = plantime;
    }

    public Date getRealrime() {
        return realrime;
    }

    public void setRealrime(Date realrime) {
        this.realrime = realrime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
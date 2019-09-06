package com.dou.domain;

import java.util.Date;

public class Operator {
    private Integer id;

    private String machinecde;

    private Date plantime;

    private Date realtime;

    private Double price;

    private String technician;

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

    public Date getRealtime() {
        return realtime;
    }

    public void setRealtime(Date realtime) {
        this.realtime = realtime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician == null ? null : technician.trim();
    }
}
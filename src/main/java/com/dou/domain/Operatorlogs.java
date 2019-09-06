package com.dou.domain;

import java.util.Date;

public class Operatorlogs {
    private Integer id;

    private String uesrid;

    private String machinecde;

    private Date time;

    private Date start;

    private Date end;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUesrid() {
        return uesrid;
    }

    public void setUesrid(String uesrid) {
        this.uesrid = uesrid == null ? null : uesrid.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
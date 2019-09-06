package com.dou.domain;

import java.util.Date;

public class Pumptable {
    private Integer id;

    private Date refreshtime;

    private String name;

    private Float uab;

    private Float ubc;

    private Float uca;

    private Float ia;

    private Float ib;

    private Float ic;

    private Float p;

    private Float q;

    private Float pf;

    private Float sy;

    private Float sflow;

    private Float lflow;

    private Integer status;

    private Integer start;

    private Integer stop;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getUab() {
        return uab;
    }

    public void setUab(Float uab) {
        this.uab = uab;
    }

    public Float getUbc() {
        return ubc;
    }

    public void setUbc(Float ubc) {
        this.ubc = ubc;
    }

    public Float getUca() {
        return uca;
    }

    public void setUca(Float uca) {
        this.uca = uca;
    }

    public Float getIa() {
        return ia;
    }

    public void setIa(Float ia) {
        this.ia = ia;
    }

    public Float getIb() {
        return ib;
    }

    public void setIb(Float ib) {
        this.ib = ib;
    }

    public Float getIc() {
        return ic;
    }

    public void setIc(Float ic) {
        this.ic = ic;
    }

    public Float getP() {
        return p;
    }

    public void setP(Float p) {
        this.p = p;
    }

    public Float getQ() {
        return q;
    }

    public void setQ(Float q) {
        this.q = q;
    }

    public Float getPf() {
        return pf;
    }

    public void setPf(Float pf) {
        this.pf = pf;
    }

    public Float getSy() {
        return sy;
    }

    public void setSy(Float sy) {
        this.sy = sy;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getStop() {
        return stop;
    }

    public void setStop(Integer stop) {
        this.stop = stop;
    }
}
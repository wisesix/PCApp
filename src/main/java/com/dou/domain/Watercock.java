package com.dou.domain;

public class Watercock {
    private String id;

    private String machniecde;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMachniecde() {
        return machniecde;
    }

    public void setMachniecde(String machniecde) {
        this.machniecde = machniecde == null ? null : machniecde.trim();
    }
}
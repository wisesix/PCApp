package com.dou.domain;

public class Pump {
    private Integer pumbId;

    private String machinecde;

    private String code;

    private String localcoding;

    private Integer usestatus;

    private String dtu;

    private String dtuport;

    private String villagers;

    private Integer controlmode;

    private String frequency;

    private String cfrequency;
    //test
	private String id;
	
	private String phone;
	
	private String voltage;
	
	private String current;
	
	private String power;
	
	private String lift;

	@Override
	public String toString() {
		return "Pump [pumbId=" + pumbId + ", machinecde=" + machinecde + ", code=" + code + ", localcoding="
				+ localcoding + ", usestatus=" + usestatus + ", dtu=" + dtu + ", dtuport=" + dtuport + ", villagers="
				+ villagers + ", controlmode=" + controlmode + ", frequency=" + frequency + ", cfrequency=" + cfrequency
				+ ", id=" + id + ", phone=" + phone + ", voltage=" + voltage + ", current=" + current + ", power="
				+ power + ", lift=" + lift + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getLift() {
		return lift;
	}

	public void setLift(String lift) {
		this.lift = lift;
	}

	public Integer getPumbId() {
        return pumbId;
    }

    public void setPumbId(Integer pumbId) {
        this.pumbId = pumbId;
    }

    public String getMachinecde() {
        return machinecde;
    }

    public void setMachinecde(String machinecde) {
        this.machinecde = machinecde == null ? null : machinecde.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getLocalcoding() {
        return localcoding;
    }

    public void setLocalcoding(String localcoding) {
        this.localcoding = localcoding == null ? null : localcoding.trim();
    }

    public Integer getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(Integer usestatus) {
        this.usestatus = usestatus;
    }

    public String getDtu() {
        return dtu;
    }

    public void setDtu(String dtu) {
        this.dtu = dtu == null ? null : dtu.trim();
    }

    public String getDtuport() {
        return dtuport;
    }

    public void setDtuport(String dtuport) {
        this.dtuport = dtuport == null ? null : dtuport.trim();
    }

    public String getVillagers() {
        return villagers;
    }

    public void setVillagers(String villagers) {
        this.villagers = villagers == null ? null : villagers.trim();
    }

    public Integer getControlmode() {
        return controlmode;
    }

    public void setControlmode(Integer controlmode) {
        this.controlmode = controlmode;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getCfrequency() {
        return cfrequency;
    }

    public void setCfrequency(String cfrequency) {
        this.cfrequency = cfrequency == null ? null : cfrequency.trim();
    }
}
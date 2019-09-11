package com.dou.domain;

import java.util.Date;
/**
 * 
 * @author Dell
 *
 */
public class Operatorlogs {
    private Integer id;

    private String uesrid;

    private String machinecde;

    private Date time;
    
    //开始时间
    private Date start;
    //结束时间
    private Date end;

    private Integer status;
    //灌溉时间
    private Integer realtime;
    //用水量
    private String watersum;
    
    
    
    
    @Override
	public String toString() {
		return "Operatorlogs [id=" + id + ", uesrid=" + uesrid + ", machinecde=" + machinecde + ", time=" + time
				+ ", start=" + start + ", end=" + end + ", status=" + status + ", realtime=" + realtime + ", watersum="
				+ watersum + "]";
	}

	public Integer getRealtime() {
		return realtime;
	}

	public void setRealtime(Integer realtime) {
		this.realtime = realtime;
	}

	public String getWatersum() {
		return watersum;
	}

	public void setWatersum(String watersum) {
		this.watersum = watersum;
	}

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
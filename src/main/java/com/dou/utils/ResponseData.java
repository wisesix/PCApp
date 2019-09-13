package com.dou.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回实体
 * 
 * @Author guozq5 [guozq5@asiainfo.com]
 * @Date 2017/7/4
 * @Time 14:24
 **/
public class ResponseData<T> {
    /** 成功标识 */
    private String retCode = "200";
    /** 提示信息 */
    private String retInfo = "Operation Succeeded";
    /** 扩展信息 */
    private ResponseRowsData data;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetInfo() {
        return retInfo;
    }

    public void setRetInfo(String retInfo) {
        this.retInfo = retInfo;
    }

    public ResponseRowsData getData() {
        return data;
    }

    public void setData(ResponseRowsData data) {
        this.data = data;
    }
}

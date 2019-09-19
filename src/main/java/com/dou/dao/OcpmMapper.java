package com.dou.dao;

import com.dou.domain.Ocpm;

public interface OcpmMapper {

	// 小程序开栓请求打开泵、栓
	boolean openOcpminfo(String machinecde);

	// 小程序关栓请求关闭泵、栓
	boolean closeOcpminfo(String machinecde);

	
	// 返回小程序开栓请求打开泵、栓
	Ocpm fopenOcpminfo(String machinecde);

	// 返回小程序关栓请求关闭泵、栓
	Ocpm fcloseOcpminfo(String machinecde);

}

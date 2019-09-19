package com.dou.service;

import org.springframework.stereotype.Service;

import com.dou.domain.Ocpm;

@Service
public interface OcpmService {

	// 小程序开栓请求打开泵、栓
	boolean openOcpminfo(String machinecde);

	// 小程序关栓请求关闭泵、栓
	boolean closeOcpminfo(String machinecde);

	// 返回小程序开栓请求打开泵、栓
	Ocpm fopenOcpminfo(String machinecde);

	// 返回小程序关栓请求关闭泵、栓
	Ocpm fcloseOcpminfo(String machinecde);

}

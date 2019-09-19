package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.OcpmMapper;
import com.dou.domain.Ocpm;
import com.dou.service.OcpmService;

@Service
public class OcpmServiceImpl implements OcpmService {

	@Autowired
	OcpmMapper OcpmMapper;

	@Override
	public boolean openOcpminfo(String machinecde) {
		// TODO Auto-generated method stub
		return OcpmMapper.openOcpminfo(machinecde);
	}

	@Override
	public boolean closeOcpminfo(String machinecde) {
		// TODO Auto-generated method stub
		return OcpmMapper.closeOcpminfo(machinecde);
	}

	@Override
	public Ocpm fopenOcpminfo(String machinecde) {
		// TODO Auto-generated method stub
		return OcpmMapper.fopenOcpminfo(machinecde);
	}

	@Override
	public Ocpm fcloseOcpminfo(String machinecde) {
		// TODO Auto-generated method stub
		return OcpmMapper.fcloseOcpminfo(machinecde);
	}

}

package com.dou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.PumpMapper;
import com.dou.dao.WXPumpMapper;
import com.dou.domain.Pump;
import com.dou.domain.WXPumpModel;
import com.dou.service.WXInserPumpSercice;

@Service
public class WXInserPumpSerciceImpl implements WXInserPumpSercice{
	
	@Autowired
	WXPumpMapper WXPumpMapper;
	
	@Override
	public int inserPumpbycode(WXPumpModel wXPumpModel) {
		// TODO Auto-generated method stub
		return WXPumpMapper.inserPumpinfo(wXPumpModel);
	}

	@Override
	public WXPumpModel insertPumpinfo(String phone) {
		// TODO Auto-generated method stub
		return WXPumpMapper.insertPumpinfo(phone);
	}

	@Override
	public WXPumpModel selectZhexian(String code) {
		// TODO Auto-generated method stub
		return WXPumpMapper.selectZhexian(code);
	}


}

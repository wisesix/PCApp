package com.dou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dou.dao.MachineMapper;
import com.dou.domain.Machine;
import com.dou.service.MachineConfigService;

@Service
public class MachineConfigServiceImpl implements MachineConfigService {

	@Autowired
	private MachineMapper MachineMapper;

	@Override
	public List<Map<String, Machine>> getMachineList(Machine machine) {
		return MachineMapper.getMachineList(machine);
	}

	@Override
	public void deleteMachine(Machine machine) {
		// TODO Auto-generated method stub
		MachineMapper.deleteMachine(machine);

	}

	@Override
	public void updaMachine(Machine machine) {
		// TODO Auto-generated method stub
		MachineMapper.updateMachine(machine);
	}

	@Override
	public int inserMachineinfo(Machine machine) {
		// TODO Auto-generated method stub
		return MachineMapper.inserMachineinfo(machine);
	}

	@Override
	public List<Machine> insertMachineinfo(String phone) {
		// TODO Auto-generated method stub
		return MachineMapper.insertMachineinfo(phone);
	}
	//电磁阀状态
	@Override
	public Machine insertElelockstainfo(String machinecde) {
		return MachineMapper.insertElelockstainfo(machinecde);
	}
	//手动阀状态
	@Override
	public Machine insertValvestainfo(String machinecde) {
		// TODO Auto-generated method stub
		return MachineMapper.insertValvestainfo(machinecde);
	}

}

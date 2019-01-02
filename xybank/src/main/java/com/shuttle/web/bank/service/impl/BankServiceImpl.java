package com.shuttle.web.bank.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuttle.web.bank.dao.BankDao;
import com.shuttle.web.bank.domain.BankDO;
import com.shuttle.web.bank.service.BankService;



@Service
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDao bankDao;
	
	@Override
	public BankDO get(Integer id){
		return bankDao.get(id);
	}
	
	@Override
	public List<BankDO> list(Map<String, Object> map){
		return bankDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return bankDao.count(map);
	}
	
	@Override
	public int save(BankDO bank){
		return bankDao.save(bank);
	}
	
	@Override
	public int update(BankDO bank){
		return bankDao.update(bank);
	}
	
	@Override
	public int remove(Integer id){
		return bankDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return bankDao.batchRemove(ids);
	}
	
}

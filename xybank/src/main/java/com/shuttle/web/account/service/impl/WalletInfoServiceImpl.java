package com.shuttle.web.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuttle.web.account.dao.WalletInfoDao;
import com.shuttle.web.account.domain.WalletInfoDO;
import com.shuttle.web.account.service.WalletInfoService;

import java.util.List;
import java.util.Map;



@Service
public class WalletInfoServiceImpl implements WalletInfoService {
	@Autowired
	private WalletInfoDao walletInfoDao;
	
	@Override
	public WalletInfoDO get(String walletId){
		return walletInfoDao.get(walletId);
	}
	
	@Override
	public List<WalletInfoDO> list(Map<String, Object> map){
		return walletInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return walletInfoDao.count(map);
	}
	
	@Override
	public int save(WalletInfoDO walletInfo){
		return walletInfoDao.save(walletInfo);
	}
	
	@Override
	public int update(WalletInfoDO walletInfo){
		return walletInfoDao.update(walletInfo);
	}
	
	@Override
	public int remove(String walletId){
		return walletInfoDao.remove(walletId);
	}
	
	@Override
	public int batchRemove(String[] walletIds){
		return walletInfoDao.batchRemove(walletIds);
	}
	
}

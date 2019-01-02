package com.shuttle.web.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuttle.web.account.dao.WalletDetailDao;
import com.shuttle.web.account.domain.WalletDetailDO;
import com.shuttle.web.account.service.WalletDetailService;

import java.util.List;
import java.util.Map;



@Service
public class WalletDetailServiceImpl implements WalletDetailService {
	@Autowired
	private WalletDetailDao walletDetailDao;
	
	@Override
	public WalletDetailDO get(String walletDetailId){
		return walletDetailDao.get(walletDetailId);
	}
	
	@Override
	public List<WalletDetailDO> list(Map<String, Object> map){
		return walletDetailDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return walletDetailDao.count(map);
	}
	
	@Override
	public int save(WalletDetailDO walletDetail){
		return walletDetailDao.save(walletDetail);
	}
	
	@Override
	public int update(WalletDetailDO walletDetail){
		return walletDetailDao.update(walletDetail);
	}
	
	@Override
	public int remove(String walletDetailId){
		return walletDetailDao.remove(walletDetailId);
	}
	
	@Override
	public int batchRemove(String[] walletDetailIds){
		return walletDetailDao.batchRemove(walletDetailIds);
	}
	
}

package com.shuttle.web.account.service;

import java.util.List;
import java.util.Map;

import com.shuttle.web.account.domain.WalletInfoDO;

/**
 * 
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2018-02-11 15:34:42
 */
public interface WalletInfoService {
	
	WalletInfoDO get(String walletId);
	
	List<WalletInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WalletInfoDO walletInfo);
	
	int update(WalletInfoDO walletInfo);
	
	int remove(String walletId);
	
	int batchRemove(String[] walletIds);
}

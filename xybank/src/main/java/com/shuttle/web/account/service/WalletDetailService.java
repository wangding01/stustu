package com.shuttle.web.account.service;

import java.util.List;
import java.util.Map;

import com.shuttle.web.account.domain.WalletDetailDO;

/**
 * 
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2018-02-11 15:34:42
 */
public interface WalletDetailService {
	
	WalletDetailDO get(String walletDetailId);
	
	List<WalletDetailDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WalletDetailDO walletDetail);
	
	int update(WalletDetailDO walletDetail);
	
	int remove(String walletDetailId);
	
	int batchRemove(String[] walletDetailIds);
}

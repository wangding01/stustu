package com.shuttle.web.account.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.shuttle.web.account.domain.WalletInfoDO;

/**
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2018-02-11 15:34:42
 */
@Mapper
public interface WalletInfoDao {

	WalletInfoDO get(String walletId);
	
	WalletInfoDO getByUser(String userId);
	
	List<WalletInfoDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(WalletInfoDO walletInfo);
	
	int update(WalletInfoDO walletInfo);
	
	int remove(String wallet_id);
	
	int batchRemove(String[] walletIds);
}

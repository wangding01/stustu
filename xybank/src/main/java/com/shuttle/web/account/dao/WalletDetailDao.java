package com.shuttle.web.account.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.shuttle.web.account.domain.WalletDetailDO;

/**
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2018-02-11 15:34:42
 */
@Mapper
public interface WalletDetailDao {

	WalletDetailDO get(String walletDetailId);
	
	List<WalletDetailDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(WalletDetailDO walletDetail);
	
	int update(WalletDetailDO walletDetail);
	
	int remove(String wallet_detail_id);
	
	int batchRemove(String[] walletDetailIds);
}

package com.shuttle.web.bank.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.shuttle.web.bank.domain.BankDO;

/**
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2019-01-03 14:28:35
 */
@Mapper
public interface BankDao {

	BankDO get(Integer id);
	
	List<BankDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(BankDO bank);
	
	int update(BankDO bank);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}

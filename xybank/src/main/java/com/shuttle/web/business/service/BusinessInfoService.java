package com.shuttle.web.business.service;

import com.shuttle.web.business.domain.BusinessInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author lisonggen
 * @email lisonggen@maoniuchuxing.net
 * @date 2018-03-20 17:08:44
 */
public interface BusinessInfoService {

	BusinessInfoDO get(Long businessId);

	List<BusinessInfoDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(BusinessInfoDO businessInfo);

	int update(BusinessInfoDO businessInfo);

	int remove(Long businessId);

	int batchRemove(Long[] businessIds);

	int resetPwd(Map<String, Object> param);

	/**
	 * 根据用户id查商户
	 * 
	 * @param userId
	 * @return
	 */
	BusinessInfoDO getByUserId(Long userId);
}

package com.shuttle.web.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.shuttle.web.business.dao.BusinessInfoDao;
import com.shuttle.web.business.domain.BusinessInfoDO;
import com.shuttle.web.business.service.BusinessInfoService;

@Service
public class BusinessInfoServiceImpl implements BusinessInfoService {
	@Autowired
	private BusinessInfoDao businessInfoDao;

	@Override
	public BusinessInfoDO get(Long businessId) {
		return businessInfoDao.get(businessId);
	}

	@Override
	public List<BusinessInfoDO> list(Map<String, Object> map) {
		return businessInfoDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return businessInfoDao.count(map);
	}

	@Override
	public int save(BusinessInfoDO businessInfo) {
		return businessInfoDao.save(businessInfo);
	}

	@Override
	public int update(BusinessInfoDO businessInfo) {
		return businessInfoDao.update(businessInfo);
	}

	@Override
	public int remove(Long businessId) {
		return businessInfoDao.remove(businessId);
	}

	@Override
	public int batchRemove(Long[] businessIds) {
		return businessInfoDao.batchRemove(businessIds);
	}

	@Override
	public int resetPwd(Map<String, Object> param) {
		return businessInfoDao.resetPwd(param);
	}

	@Override
	public BusinessInfoDO getByUserId(Long userId) {
		return businessInfoDao.getByUserId(userId);
	}

}

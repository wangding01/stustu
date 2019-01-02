package com.shuttle.web.product.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuttle.common.utils.SnowflakeIdWorker;
import com.shuttle.web.product.dao.ProductDao;
import com.shuttle.web.product.domain.ProductDO;
import com.shuttle.web.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public ProductDO get(Long id) {
		ProductDO product = productDao.get(id);
		product.setPrimeCost(product.getPrimeCost() / 100);
		product.setSalePrice(product.getSalePrice() / 100);
		return product;
	}

	@Override
	public List<ProductDO> list(Map<String, Object> map) {
		return productDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return productDao.count(map);
	}

	@Override
	public int save(ProductDO product) {
		product.setPrimeCost(product.getPrimeCost() * 100);
		product.setSalePrice(product.getSalePrice() * 100);
		Date day = new Date();
		SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();
		String id = Long.toString(snowflakeIdWorker.nextId());
		product.setId(id);
		// 设置上架时间
		product.setShelfTime(day);
		return productDao.save(product);
	}

	@Override
	public int update(ProductDO product) {
		product.setPrimeCost(product.getPrimeCost() * 100);
		product.setSalePrice(product.getSalePrice() * 100);
		return productDao.update(product);
	}

	@Override
	public int remove(Long id) {
		return productDao.remove(id);
	}

	@Override
	public int batchRemove(Long[] ids) {
		return productDao.batchRemove(ids);
	}

}

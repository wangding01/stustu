package com.shuttle.web.product.service;

import com.shuttle.web.product.domain.ProductDO;

import java.util.List;
import java.util.Map;

/**
 * 商品
 * 
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-20 17:48:48
 */
public interface ProductService {
	
	ProductDO get(Long id);
	
	List<ProductDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProductDO product);
	
	int update(ProductDO product);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

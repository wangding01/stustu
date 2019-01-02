package com.shuttle.web.product.dao;

import com.shuttle.web.product.domain.ProductDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 商品
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-20 17:48:48
 */
@Mapper
public interface ProductDao {

	ProductDO get(Long id);
	
	List<ProductDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ProductDO product);
	
	int update(ProductDO product);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

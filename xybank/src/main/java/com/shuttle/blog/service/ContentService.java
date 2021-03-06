package com.shuttle.blog.service;

import java.util.List;
import java.util.Map;

import com.shuttle.blog.domain.ContentDO;

/**
 * 文章内容
 * 
 * @author yongwei
 * @email yongwei1991@qq.com
 * @date 2017-09-09 10:03:34
 */
public interface ContentService {
	
	ContentDO get(Long cid);
	
	List<ContentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ContentDO bContent);
	
	int update(ContentDO bContent);
	
	int remove(Long cid);
	
	int batchRemove(Long[] cids);
}

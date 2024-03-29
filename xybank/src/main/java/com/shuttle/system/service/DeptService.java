package com.shuttle.system.service;

import java.util.List;
import java.util.Map;

import com.shuttle.common.domain.Tree;
import com.shuttle.system.domain.DeptDO;

/**
 * 部门管理
 * 
 * @author yongwei
 * @email yongwei1991@qq.com
 * @date 2017-09-27 14:28:36
 */
public interface DeptService {
	
	DeptDO get(Long deptId);
	
	List<DeptDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DeptDO sysDept);
	
	int update(DeptDO sysDept);
	
	int remove(Long deptId);
	
	int batchRemove(Long[] deptIds);

	Tree<DeptDO> getTree();
	
	boolean checkDeptHasUser(Long deptId);
}

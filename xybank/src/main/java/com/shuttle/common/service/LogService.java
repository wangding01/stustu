package com.shuttle.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shuttle.common.domain.LogDO;
import com.shuttle.common.domain.PageDO;
import com.shuttle.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}

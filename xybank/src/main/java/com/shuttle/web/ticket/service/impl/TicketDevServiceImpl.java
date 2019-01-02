package com.shuttle.web.ticket.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuttle.web.business.dao.BusinessInfoDao;
import com.shuttle.web.ticket.dao.TicketDevDao;
import com.shuttle.web.ticket.domain.TicketDevDO;
import com.shuttle.web.ticket.service.TicketDevService;

@Service
public class TicketDevServiceImpl implements TicketDevService {
	@Autowired
	private TicketDevDao ticketDevDao;
	@Autowired
	private BusinessInfoDao businessInfoDao;

	@Override
	public TicketDevDO get(String ticketId) {
		return ticketDevDao.get(ticketId);
	}

	@Override
	public List<TicketDevDO> list(Map<String, Object> map) {
		return ticketDevDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return ticketDevDao.count(map);
	}

	@Override
	public int save(TicketDevDO ticketDev) {
		return ticketDevDao.save(ticketDev);
	}

	@Override
	public int update(TicketDevDO ticketDev) {
		return ticketDevDao.update(ticketDev);
	}

	@Override
	public int remove(Long ticketId) {
		return ticketDevDao.remove(ticketId);
	}

	@Override
	public int batchRemove(Long[] ticketIds) {
		return ticketDevDao.batchRemove(ticketIds);
	}

}

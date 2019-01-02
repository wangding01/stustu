package com.shuttle.web.ticket.service;

import com.shuttle.web.ticket.domain.TicketDevDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-23 17:33:04
 */
public interface TicketDevService {
	
	TicketDevDO get(String ticketId);
	
	List<TicketDevDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TicketDevDO ticketDev);
	
	int update(TicketDevDO ticketDev);
	
	int remove(Long ticketId);
	
	int batchRemove(Long[] ticketIds);
}

package com.shuttle.web.ticket.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.shuttle.web.ticket.domain.TicketDevDO;

/**
 * 
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-23 17:33:04
 */
@Mapper
public interface TicketDevDao {

	TicketDevDO get(String ticketId);
	
	List<TicketDevDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(TicketDevDO ticketDev);
	
	int update(TicketDevDO ticketDev);
	
	int remove(Long ticket_id);
	
	int batchRemove(Long[] ticketIds);
}

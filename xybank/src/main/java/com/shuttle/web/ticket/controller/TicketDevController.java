package com.shuttle.web.ticket.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shuttle.common.utils.PageUtils;
import com.shuttle.common.utils.Query;
import com.shuttle.common.utils.R;
import com.shuttle.common.utils.ShiroUtils;
import com.shuttle.web.business.domain.BusinessInfoDO;
import com.shuttle.web.business.service.BusinessInfoService;
import com.shuttle.web.ticket.domain.TicketDevDO;
import com.shuttle.web.ticket.service.TicketDevService;

/**
 * 
 * 
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-23 17:33:04
 */

@Controller
@RequestMapping("/web/ticket/ticketDev")
public class TicketDevController {
	@Autowired
	private TicketDevService ticketDevService;
	@Autowired
	private BusinessInfoService businessInfoService;

	@GetMapping()
	@RequiresPermissions("web:ticket:ticketDev:ticketDev")
	String TicketDev() {
		return "web/ticket/ticketDev/ticketDev";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("web:ticket:ticketDev:ticketDev")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 拿到登录用户
		Long userId = ShiroUtils.getUserId();
		// 根据用户查找商户id
		BusinessInfoDO businessInfoDO = businessInfoService.getByUserId(userId);
		if (businessInfoDO != null) {
			Long businessId = businessInfoDO.getBusinessId();
			if (businessId != null) {
				params.put("creator", businessInfoDO.getBusinessId());
			}
		}
		// 查询列表数据
		Query query = new Query(params);
		List<TicketDevDO> ticketDevList = ticketDevService.list(query);
		int total = ticketDevService.count(query);
		PageUtils pageUtils = new PageUtils(ticketDevList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("web:ticket:ticketDev:add")
	String add() {
		return "web/ticket/ticketDev/add";
	}

	@GetMapping("/edit/{ticketId}")
	@RequiresPermissions("web:ticket:ticketDev:edit")
	String edit(@PathVariable("ticketId") String ticketId, Model model) {
		TicketDevDO ticketDev = ticketDevService.get(ticketId);
		model.addAttribute("ticketDev", ticketDev);
		return "web/ticket/ticketDev/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("web:ticket:ticketDev:add")
	public R save(TicketDevDO ticketDev) {
		if (ticketDevService.save(ticketDev) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("web:ticket:ticketDev:edit")
	public R update(TicketDevDO ticketDev) {
		ticketDevService.update(ticketDev);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("web:ticket:ticketDev:remove")
	public R remove(Long ticketId) {
		if (ticketDevService.remove(ticketId) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("web:ticket:ticketDev:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ticketIds) {
		ticketDevService.batchRemove(ticketIds);
		return R.ok();
	}

}

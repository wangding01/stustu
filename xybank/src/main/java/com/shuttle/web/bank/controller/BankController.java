package com.shuttle.web.bank.controller;

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
import com.shuttle.ttt.Mu;
import com.shuttle.web.bank.domain.BankDO;
import com.shuttle.web.bank.service.BankService;

/**
 * 
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2019-01-03 14:28:35
 */

@Controller
@RequestMapping("/web/web/bank")
public class BankController {
	@Autowired
	private BankService bankService;

	@GetMapping()
	@RequiresPermissions("web:web:bank:bank")
	String Bank() {
		return "web/bank/bank";
	}

	@Mu
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("web:web:bank:bank")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<BankDO> bankList = bankService.list(query);
		int total = bankService.count(query);
		PageUtils pageUtils = new PageUtils(bankList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("web:web:bank:add")
	String add() {
		return "web/bank/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("web:web:bank:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		BankDO bank = bankService.get(id);
		model.addAttribute("bank", bank);
		return "web/bank/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("web:web:bank:add")
	public R save(BankDO bank) {
		if (bankService.save(bank) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("web:web:bank:edit")
	public R update(BankDO bank) {
		bankService.update(bank);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("web:web:bank:remove")
	public R remove(Integer id) {
		if (bankService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("web:web:bank:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		bankService.batchRemove(ids);
		return R.ok();
	}

}

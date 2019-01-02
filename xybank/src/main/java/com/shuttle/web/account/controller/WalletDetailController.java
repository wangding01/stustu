package com.shuttle.web.account.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shuttle.common.utils.PageUtils;
import com.shuttle.common.utils.Query;
import com.shuttle.common.utils.R;
import com.shuttle.web.account.domain.WalletDetailDO;
import com.shuttle.web.account.service.WalletDetailService;

/**
 * 
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2018-02-11 15:34:42
 */
 
@Controller
@RequestMapping("/web/account/walletDetail")
public class WalletDetailController {
	@Autowired
	private WalletDetailService walletDetailService;
	
	@GetMapping()
	@RequiresPermissions("web:account:walletDetail:walletDetail")
	String WalletDetail(){
	    return "web/account/walletDetail/walletDetail";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("web:account:walletDetail:walletDetail")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WalletDetailDO> walletDetailList = walletDetailService.list(query);
		int total = walletDetailService.count(query);
		PageUtils pageUtils = new PageUtils(walletDetailList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("web:account:walletDetail:add")
	String add(){
	    return "web/account/walletDetail/add";
	}

	@GetMapping("/edit/{walletDetailId}")
	@RequiresPermissions("web:account:walletDetail:edit")
	String edit(@PathVariable("walletDetailId") String walletDetailId,Model model){
		WalletDetailDO walletDetail = walletDetailService.get(walletDetailId);
		model.addAttribute("walletDetail", walletDetail);
	    return "web/account/walletDetail/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("web:account:walletDetail:add")
	public R save( WalletDetailDO walletDetail){
		if(walletDetailService.save(walletDetail)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("web:account:walletDetail:edit")
	public R update( WalletDetailDO walletDetail){
		walletDetailService.update(walletDetail);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("web:account:walletDetail:remove")
	public R remove( String walletDetailId){
		if(walletDetailService.remove(walletDetailId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("web:account:walletDetail:batchRemove")
	public R remove(@RequestParam("ids[]") String[] walletDetailIds){
		walletDetailService.batchRemove(walletDetailIds);
		return R.ok();
	}
	
}

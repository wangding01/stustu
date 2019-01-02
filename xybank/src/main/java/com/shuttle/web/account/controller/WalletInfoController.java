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
import com.shuttle.web.account.domain.WalletInfoDO;
import com.shuttle.web.account.service.WalletInfoService;

/**
 * 
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2018-02-11 15:34:42
 */
 
@Controller
@RequestMapping("/web/account/walletInfo")
public class WalletInfoController {
	@Autowired
	private WalletInfoService walletInfoService;
	
	@GetMapping()
	@RequiresPermissions("web:account:walletInfo:walletInfo")
	String WalletInfo(){
	    return "web/account/walletInfo/walletInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("web:account:walletInfo:walletInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WalletInfoDO> walletInfoList = walletInfoService.list(query);
		int total = walletInfoService.count(query);
		PageUtils pageUtils = new PageUtils(walletInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("web:account:walletInfo:add")
	String add(){
	    return "web/account/walletInfo/add";
	}

	@GetMapping("/edit/{walletId}")
	@RequiresPermissions("web:account:walletInfo:edit")
	String edit(@PathVariable("walletId") String walletId,Model model){
		WalletInfoDO walletInfo = walletInfoService.get(walletId);
		model.addAttribute("walletInfo", walletInfo);
	    return "web/account/walletInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("web:account:walletInfo:add")
	public R save( WalletInfoDO walletInfo){
		if(walletInfoService.save(walletInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("web:account:walletInfo:edit")
	public R update( WalletInfoDO walletInfo){
		walletInfoService.update(walletInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("web:account:walletInfo:remove")
	public R remove( String walletId){
		if(walletInfoService.remove(walletId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("web:account:walletInfo:batchRemove")
	public R remove(@RequestParam("ids[]") String[] walletIds){
		walletInfoService.batchRemove(walletIds);
		return R.ok();
	}
	
}

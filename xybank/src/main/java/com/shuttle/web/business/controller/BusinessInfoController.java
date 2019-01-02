package com.shuttle.web.business.controller;

import java.util.HashMap;
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

import com.shuttle.common.utils.MD5Utils;
import com.shuttle.common.utils.PageUtils;
import com.shuttle.common.utils.Query;
import com.shuttle.common.utils.R;
import com.shuttle.common.utils.ReadExcelUtil;
import com.shuttle.common.utils.ShiroUtils;
import com.shuttle.web.business.domain.BusinessInfoDO;
import com.shuttle.web.business.service.BusinessInfoService;

/**
 * 
 * 
 * @author wangding
 * @email wangding@maoniuchuxing.net
 * @date 2018-03-20 17:08:44
 */

@Controller
@RequestMapping("/web/business/businessInfo")
public class BusinessInfoController {
	@Autowired
	private BusinessInfoService businessInfoService;

	@GetMapping()
	@RequiresPermissions("web:business:businessInfo:businessInfo")
	String BusinessInfo() {
		return "web/business/businessInfo/businessInfo";
	}

	@GetMapping("/setup")
	@RequiresPermissions("web:business:businessInfo:setup")
	String BusinessInfoSetup(Model model) {
		Long UserId = ShiroUtils.getUserId();
		BusinessInfoDO businessInfo = businessInfoService.getByUserId(UserId);
		model.addAttribute("businessInfo", businessInfo);
		return "web/business/businessInfo/setup";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("web:business:businessInfo:businessInfo")
	public PageUtils list(@RequestParam Map<String, Object> params) throws Exception {
		// 查询列表数据
		Query query = new Query(params);
		List<BusinessInfoDO> businessInfoList = businessInfoService.list(query);
		int total = businessInfoService.count(query);
		PageUtils pageUtils = new PageUtils(businessInfoList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("web:business:businessInfo:add")
	String add() {
		return "web/business/businessInfo/add";
	}

	@GetMapping("/edit/{businessId}")
	@RequiresPermissions("web:business:businessInfo:edit")
	String edit(@PathVariable("businessId") Long businessId, Model model) {
		BusinessInfoDO businessInfo = businessInfoService.get(businessId);
		model.addAttribute("businessInfo", businessInfo);
		return "web/business/businessInfo/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("web:business:businessInfo:add")
	public R save(BusinessInfoDO businessInfo) {
		Long UserId = ShiroUtils.getUserId();
		businessInfo.setOwnerId(UserId);
		if (businessInfoService.save(businessInfo) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("web:business:businessInfo:edit")
	public R update(BusinessInfoDO businessInfo) {
		businessInfoService.update(businessInfo);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("web:business:businessInfo:remove")
	public R remove(Long businessId) {
		if (businessInfoService.remove(businessId) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 充值密码
	 */
	@PostMapping("/resetPwd")
	@ResponseBody
	@RequiresPermissions("web:business:businessInfo:resetPwd")
	public R resetPwd(Long businessId) {
		Map<String, Object> param = new HashMap<>();
		param.put("businessId", businessId);
		String pwd = "'" + MD5Utils.getMD5By3Times("123456") + "'";
		param.put("pwd", pwd);
		if (businessInfoService.resetPwd(param) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("web:business:businessInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] businessIds) {
		businessInfoService.batchRemove(businessIds);
		return R.ok();
	}
	public static void main(String[] args) throws Exception {
		//获取手机号码的list
		String path = "E://projects//司机信息.xls";
		int col = 2;
		List<String> list = ReadExcelUtil.getList(col,path);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

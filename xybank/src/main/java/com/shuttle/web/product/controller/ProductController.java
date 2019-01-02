package com.shuttle.web.product.controller;

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

import com.shuttle.web.business.domain.BusinessInfoDO;
import com.shuttle.web.business.service.BusinessInfoService;
import com.shuttle.web.product.domain.ProductDO;
import com.shuttle.web.product.service.ProductService;
import com.shuttle.common.utils.PageUtils;
import com.shuttle.common.utils.Query;
import com.shuttle.common.utils.R;
import com.shuttle.common.utils.ShiroUtils;

/**
 * 商品
 * 
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-20 17:48:48
 */

@Controller
@RequestMapping("/web/product/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private BusinessInfoService businessInfoService;

	@GetMapping()
	@RequiresPermissions("web:product:product:product")
	String Product() {
		return "web/product/product/product";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("web:product:product:product")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<ProductDO> productList = productService.list(query);
		int total = productService.count(query);
		PageUtils pageUtils = new PageUtils(productList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("web:product:product:add")
	String add() {
		return "web/product/product/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("web:product:product:edit")
	String edit(@PathVariable("id") Long id, Model model) {
		ProductDO product = productService.get(id);
		model.addAttribute("product", product);
		return "web/product/product/edit";
	}

	@GetMapping("/buy/{id}")
	@RequiresPermissions("web:product:product:buy")
	String buy(@PathVariable("id") Long id, Model model) {
		ProductDO product = productService.get(id);
		// 拿到登录用户
		Long userId = ShiroUtils.getUserId();
		// 根据用户查找商户id
		BusinessInfoDO businessInfoDO = businessInfoService.getByUserId(userId);
		if (businessInfoDO != null) {
			Long businessId = businessInfoDO.getBusinessId();
			if (businessId != null) {
				product.setBusinessId(businessId);
			}
		}
		model.addAttribute("product", product);
		return "web/product/product/buy";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("web:product:product:add")
	public R save(ProductDO product) {
		if (productService.save(product) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("web:product:product:edit")
	public R update(ProductDO product) {
		productService.update(product);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("web:product:product:remove")
	public R remove(Long id) {
		if (productService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("web:product:product:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids) {
		productService.batchRemove(ids);
		return R.ok();
	}

}

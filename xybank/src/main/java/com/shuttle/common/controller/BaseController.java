package com.shuttle.common.controller;

import org.springframework.stereotype.Controller;

import com.shuttle.common.utils.ShiroUtils;
import com.shuttle.system.domain.UserDO;
import com.shuttle.system.domain.UserToken;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}
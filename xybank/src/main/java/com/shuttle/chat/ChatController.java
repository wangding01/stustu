package com.shuttle.chat;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shuttle.common.utils.MD5Utils;
import com.shuttle.common.utils.R;

@RestController
@RequestMapping("/web/chat")
public class ChatController {
	private Logger log = LoggerFactory.getLogger(ChatController.class);
	@Value("${natapp.urlhost}")
	private String natappUrl;

	/**
	 * 登陆界面
	 */
	@GetMapping("/loginchat")
	public ModelAndView loginChat() {
		return new ModelAndView("chat/loginchat");
	}

	/**
	 * 聊天界面
	 */
	@PostMapping("/index")
	@ResponseBody
	R index(String username, String password) {
		password = MD5Utils.encrypt(username, password);
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
			ModelAndView mav = new ModelAndView("/chat/chat");
			mav.addObject("username", username);
			mav.addObject("webSocketUrl", "ws://" + natappUrl + "/chat");
			return R.ok();
		} catch (AuthenticationException e) {
			return R.error("用户或密码错误");
		}
	}

	@GetMapping("/testlog")
	public String testlog() {
		log.debug("这是debug日志");
		return "";
	}
}

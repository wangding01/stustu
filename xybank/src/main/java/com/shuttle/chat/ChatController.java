package com.shuttle.chat;

import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

@RestController
@RequestMapping("/web/chat")
public class ChatController {
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
	@GetMapping("/index")
	public ModelAndView index(String username, String password, HttpServletRequest request)
			throws UnknownHostException {
		if (StringUtils.isEmpty(username)) {
			username = "匿名用户";
		}
		ModelAndView mav = new ModelAndView("/chat/chat");
		mav.addObject("username", username);
		mav.addObject("webSocketUrl", "ws://" + natappUrl + "/chat");
		return mav;
	}
}

package com.dxc.demo.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@EnableAsync
public class Controller {
	private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
	@Autowired
	private OneThread oneThread;
	@Autowired
	private TwoThread twoThread;

	@RequestMapping(value = "/etc/test", method = RequestMethod.GET)
	String addConfig() {
		oneThread.ex();
		twoThread.ex();
		LOGGER.info("测试swagger接口");
		return "测试swagger";
	}

}

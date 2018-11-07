package com.dxc.demo.threadpool;

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
public class Controllers {
	private static final Logger LOGGER = LoggerFactory.getLogger(Controllers.class);
	@Autowired
	private PoolService poolservice;

	@RequestMapping(value = "/etc/pooltest", method = RequestMethod.GET)
	String ass() {
		poolservice.loadThreadsPool(new OneHander());
		poolservice.loadThreadsPool(new TwoHander());
		LOGGER.info("测试swagger接口");
		return "测试swagger";
	}

}

package com.shuttle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement // 开启事务
@ServletComponentScan
@MapperScan(basePackages = { "com.shuttle.*.dao", "com.shuttle.*.*.dao" }) // 配置扫描多个路径 自动注入
@SpringBootApplication
public class ShuttleApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShuttleApplication.class, args);
		System.out.println("========SUCCESS82======");
	}
}

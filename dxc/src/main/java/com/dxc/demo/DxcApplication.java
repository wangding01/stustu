package com.dxc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DxcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxcApplication.class, args);
		System.out.println("端口号：8080");
	}
}

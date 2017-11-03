package com.shuai.usertrace2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class UserTrace2Application {

	private static Logger logger = LoggerFactory.getLogger(UserTrace2Application.class);

	@RequestMapping("/tract2")
	public String tract2(){
		logger.info("=====call=tract2====");
		return "tract2";
	}

	public static void main(String[] args) {
		SpringApplication.run(UserTrace2Application.class, args);
	}
}

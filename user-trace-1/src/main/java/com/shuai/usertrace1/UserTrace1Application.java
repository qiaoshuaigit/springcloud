package com.shuai.usertrace1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class UserTrace1Application {

	private static Logger logger = LoggerFactory.getLogger(UserTrace1Application.class);

	@Bean
	@LoadBalanced
	RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@RequestMapping("/trace1")
	public String trace1(){
		logger.info("here is tract1");
		return getRestTemplate().getForEntity("http://user-trace-2/tract2",String.class).getBody();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserTrace1Application.class, args);
	}
}

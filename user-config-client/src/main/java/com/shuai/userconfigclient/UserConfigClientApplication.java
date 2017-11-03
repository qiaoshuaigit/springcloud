package com.shuai.userconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//加入服务治理体系:3
@SpringBootApplication
public class UserConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserConfigClientApplication.class, args);
	}
}

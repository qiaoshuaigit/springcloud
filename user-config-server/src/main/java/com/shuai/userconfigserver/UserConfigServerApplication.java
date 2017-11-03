package com.shuai.userconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient//加入eureka服务治理体系:3
@SpringBootApplication
public class UserConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserConfigServerApplication.class, args);
	}
}

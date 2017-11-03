package com.shuai.usereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//启动一个服务注册中心
@EnableEurekaServer
@SpringBootApplication
public class UserEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserEurekaServerApplication.class, args);
	}
}

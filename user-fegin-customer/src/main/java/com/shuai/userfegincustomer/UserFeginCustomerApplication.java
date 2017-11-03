package com.shuai.userfegincustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients//开启声明式服务
@EnableDiscoveryClient
@SpringBootApplication
public class UserFeginCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFeginCustomerApplication.class, args);
	}
}

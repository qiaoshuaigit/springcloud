package com.shuai.userribboncustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//让应用注册为Eureka客户端 获得服务发现得能力
@EnableDiscoveryClient
@SpringBootApplication
public class UserRibbonCustomerApplication {

	@Bean
	@LoadBalanced//开启客户端负载均衡功能
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserRibbonCustomerApplication.class, args);
	}
}

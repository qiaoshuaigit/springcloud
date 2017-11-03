package com.shuai.usercloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//		<!--加入eureka服务治理体系:2-->
@EnableDiscoveryClient
@SpringBootApplication
public class UserCloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCloudProviderApplication.class, args);
	}
}

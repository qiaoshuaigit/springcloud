package com.shuai.userapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class UserApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApiGatewayApplication.class, args);
	}
	//实现过滤器并不能马上生效,需要提供过滤器bean
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}

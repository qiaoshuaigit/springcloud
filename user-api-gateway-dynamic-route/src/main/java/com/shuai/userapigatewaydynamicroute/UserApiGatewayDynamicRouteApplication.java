package com.shuai.userapigatewaydynamicroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
@EnableZuulProxy
@SpringBootApplication
public class UserApiGatewayDynamicRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApiGatewayDynamicRouteApplication.class, args);
	}

	@Bean
	@RefreshScope//开启刷新功能
	@ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties(){
		return new ZuulProperties();
	}
}

package com.shuai.userzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

//@EnableZipkinServer//对http请求
@EnableZipkinStreamServer//对消息中间件得注解
@SpringBootApplication
public class UserZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserZipkinServerApplication.class, args);
	}
}

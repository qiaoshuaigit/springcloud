package com.shuai.userhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard//启动仪表盘组件
@SpringBootApplication
public class UserHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserHystrixDashboardApplication.class, args);
	}
}

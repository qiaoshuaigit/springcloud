package com.shuai.userfegincustomer.service;

import com.shuai.services.*;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "HELLO-SERVICE")//绑定服务
public interface RefactorHelloService extends com.shuai.services.HelloService {
}

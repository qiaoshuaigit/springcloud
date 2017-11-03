package com.shuai.userfegincustomer.service;

import com.shuai.userfegincustomer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
    @RequestMapping("/hello1")
    String hello1(@RequestHeader("name") String name);
    @RequestMapping("/hello2")
    String hello2(@RequestHeader("name") String name,@RequestHeader("age") Integer age);
    @RequestMapping("/hello3")
    String hello3(@RequestBody User user);

}

package com.shuai.services;

import com.shuai.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping("/hello4")
    String hello4(@RequestHeader("name") String name);
    @RequestMapping("/hello5")
    User hello5(@RequestHeader("name") String name,@RequestHeader("age") Integer age);
    @RequestMapping("/hello6")
    String hello6(@RequestBody User user);
}

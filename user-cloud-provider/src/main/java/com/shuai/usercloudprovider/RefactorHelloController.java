package com.shuai.usercloudprovider;

import com.shuai.entity.User;
import com.shuai.services.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuaion 2017/10/20
 **/
@RestController
public class RefactorHelloController implements HelloService{


    @Override
    public String hello4(@RequestHeader("name") String name) {
        return "hello "+name;
    }

    @Override
    public User hello5(@RequestHeader("name") String s, @RequestHeader("age") Integer age) {
        return new User(s,age);
    }

    @Override
    public String hello6(@RequestBody User user) {
        return "hello "+user.toString();
    }
}

package com.shuai.userfegincustomer.controller;

import com.shuai.userfegincustomer.service.HelloService;
import com.shuai.userfegincustomer.entity.User;
import com.shuai.userfegincustomer.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuaion 2017/10/18
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    private RefactorHelloService rHelloService;

    @RequestMapping("/feginHello")
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping("/feginHello2")
    public String hello1(){
        StringBuffer sb = new StringBuffer();
        sb.append("hello1:").append(helloService.hello1("aobama")).append("\n");
        sb.append("hello2:").append(helloService.hello2("jinzhengen",34)).append("\n");
        sb.append("hello3:").append(helloService.hello3(new User("telangpu",50))).append("\n");
        return sb.toString();
    }
    @RequestMapping("/fegin-customer")
    public String hello7(){
        StringBuffer sb = new StringBuffer();

        String h4 = rHelloService.hello4("zhangsan");

        sb.append(h4);

        String h5 = rHelloService.hello5("aobama",50).toString();

        sb.append(h5);

        String h6 = rHelloService.hello6(new com.shuai.entity.User("jinzhengen",89));

        sb.append(h6);

        return sb.toString();
    }

}

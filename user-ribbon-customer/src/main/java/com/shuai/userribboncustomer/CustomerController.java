package com.shuai.userribboncustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费
 *
 * @author shuaion 2017/10/13
 **/
@EnableCircuitBreaker //开启短路功能(容错机制)
@RestController
public class CustomerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value="ribbon-customer")
    public String customerHello(){
       return helloService.hello();
    }

}

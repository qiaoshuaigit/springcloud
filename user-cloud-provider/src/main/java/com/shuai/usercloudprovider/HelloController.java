package com.shuai.usercloudprovider;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuaion 2017/9/29
 **/
@RestController
@EnableDiscoveryClient
class HelloController{

    private Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public String index(){
        ServiceInstance serviceInstance = client.getLocalServiceInstance();
        logger.info("service="+serviceInstance.getHost()+",serviceId="+serviceInstance.getServiceId());
        return "Hello world";
    }

    @RequestMapping("/hello1")
    public String hello1(@RequestHeader String name){
        return "hello "+name;
    }
    @RequestMapping("/hello2")
    public User hello2(@RequestHeader String name,@RequestHeader Integer age){
        return new User(name,age);
    }
    @RequestMapping("/hello3")
    public String hello3(@RequestBody User user){
        return user.getName()+","+user.getAge();
    }

}

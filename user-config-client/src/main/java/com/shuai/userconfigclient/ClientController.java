package com.shuai.userconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuaion 2017/10/26
 **/
@RefreshScope
@RestController
public class ClientController {

    @Autowired
    private Environment environment;


    @RequestMapping("/from1")
    public String getConfig1(){
        System.out.println("from1");
        return environment.getProperty("from","underfind");
    }
}

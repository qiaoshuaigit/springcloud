package com.shuai.usercloudrabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RABBIT配置类
 * 用来配置路由 交换机等信息
 *
 * @author shuaion 2017/10/30
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}

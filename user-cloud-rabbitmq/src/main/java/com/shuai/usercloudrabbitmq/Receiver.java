package com.shuai.usercloudrabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收者
 *
 * @author shuaion 2017/10/30
 **/
@Component
@RabbitListener(queues = "hello")//注册对hello队列得监听
public class Receiver {


    @RabbitHandler//指定消息处理方法
    public void process(String hello){
        System.out.println("receive "+hello);
    }
}

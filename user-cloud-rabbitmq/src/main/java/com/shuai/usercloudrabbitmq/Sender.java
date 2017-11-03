package com.shuai.usercloudrabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息发送者
 *
 * @author shuaion 2017/10/30
 **/
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello "+new Date();
        System.out.println("send "+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}

package com.shuai.usercloudrabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试类
 *
 * @author shuaion 2017/10/30
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UserCloudrabbitmqApplication.class)
public class RabbitMqTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello(){
        sender.send();
    }
}

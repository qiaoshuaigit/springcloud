package com.shuai.userstreamhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author shuaion 2017/10/31
 **/
@EnableBinding(Sink.class)
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    private void receive(Object object){
        if(object instanceof byte[]){
            byte[] bytes = (byte[]) object;
            object = new String(bytes);
        }
        logger.info("Received:"+object.toString());
    }
}

package com.nettymq.server;

import java.util.concurrent.CountDownLatch;

/**
 * JMS 方式配置RabbitMQ Receiver
 * Created by xp on 2017/5/5.
 */
public class MqReceiver2 {
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("reveice msg=" + message.toString());
        latch.countDown();
    }
}

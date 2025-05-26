package com.ecomAPI.notification_service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderEventConsumer {
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void handleOrderEvent(Map<String,Object> orderEvent) {
        System.out.println("Order event: "+orderEvent);

    }
}

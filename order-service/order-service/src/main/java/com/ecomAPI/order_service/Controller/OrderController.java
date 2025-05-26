package com.ecomAPI.order_service.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final RabbitTemplate rabbitTemplate;
    @Value("${spring.rabbitmq.password}")
    private  String pwd;

    @GetMapping("")
    public ResponseEntity<?> getAllOrder() {
        rabbitTemplate.convertAndSend("order.exchange", "order.tracking",
                Map.of("order id ", Math.random() * 100, "Status",
                        HttpStatus.CREATED));
        System.out.println(pwd);
        return new ResponseEntity<>("get all orders", HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> createOrder() {
        return new ResponseEntity<>("get all orders", HttpStatus.OK);
    }
}

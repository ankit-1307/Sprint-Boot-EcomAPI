package com.ecomAPI.order_service.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping("")
    public ResponseEntity<?> getAllOrder() {
        return new ResponseEntity<>("get all orders", HttpStatus.OK);
    }
}

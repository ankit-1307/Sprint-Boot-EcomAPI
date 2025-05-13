package com.ecomAPI.user.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductService {

    @GetMapping("")
    public ResponseEntity<?> getAllOrders() {
        return new ResponseEntity<>("getting all orders", HttpStatus.OK);
    }
}

package com.ecomAPI.user.userContoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>("get all users", HttpStatus.OK);
    }
}

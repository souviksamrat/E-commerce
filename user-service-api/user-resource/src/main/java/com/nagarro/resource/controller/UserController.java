package com.nagarro.resource.controller;

import com.nagarro.models.auth.UserAuthData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public interface UserController {

    @PostMapping("/login")
    ResponseEntity<? extends Object> userLogin(UserAuthData userAuthData);
    @GetMapping("/user/{userId}")
    ResponseEntity<? extends Object> getUserDetail(String userId);
    @GetMapping("/all-user")
    ResponseEntity<? extends Object> getAllUserDetails();
}

package com.nagarro.resource.controller;

import com.nagarro.models.auth.UserAuthData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserControllerImpl implements UserController{

    @Override
    public ResponseEntity<? extends Object> userLogin(@RequestBody UserAuthData userAuthData) {

        return ResponseEntity.ok(userAuthData);
    }

    @Override
    public ResponseEntity<? extends Object> getUserDetail(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<? extends Object> getAllUserDetails() {
        return null;
    }
}

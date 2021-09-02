package com.nagarro.resource.controller;

import com.nagarro.resource.rto.UserDetailsRto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserRegistrationController {

    @PostMapping("/registration")
    ResponseEntity<? extends Object> userRegistration(UserDetailsRto userDetailsRto);
}

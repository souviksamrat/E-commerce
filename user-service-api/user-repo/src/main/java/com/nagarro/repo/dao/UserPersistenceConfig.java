package com.nagarro.repo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserPersistenceConfig {

    @Autowired
    private UserRepo userRepo;


    @Bean("userPersistence")
    public UserPersistenceImpl userPersistence(UserRepo userRepo){
        return new UserPersistenceImpl(userRepo);
    }
}

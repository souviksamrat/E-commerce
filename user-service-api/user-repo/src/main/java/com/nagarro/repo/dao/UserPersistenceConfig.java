package com.nagarro.repo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserPersistenceConfig {

    @Autowired
    UserRepo userRepo;


    @Bean("userPersistence")
    public UserPersistenceImpl userPersistence(){
        return new UserPersistenceImpl(userRepo);
    }
}

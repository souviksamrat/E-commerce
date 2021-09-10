package com.nagarro.repo.dao;

import com.nagarro.repo.rto.auth.UserDetailsRto;



public class UserPersistenceImpl implements UserPersistence {

    private final UserRepo userRepo;

    public UserPersistenceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetailsRto saveUser(UserDetailsRto userData) {
        return userRepo.save(userData);
    }


}

package com.nagarro.repo.dao;

import com.nagarro.repo.rto.UserDataRto;

import java.util.Optional;

public class UserPersistenceImpl implements UserPersistence {

    private final UserRepo userRepo;

    public UserPersistenceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDataRto saveUser(UserDataRto userData) {
        return userRepo.save(userData);
    }

    @Override
    public Optional<UserDataRto> getUser(String userName) {
        return userRepo.findById(userName);
    }

    @Override
    public boolean userExistOrNot(String userName) {
        return userRepo.existsById(userName);
    }
}

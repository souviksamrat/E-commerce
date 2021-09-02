package com.nagarro.repo.dao;

import com.nagarro.repo.rto.UserDataRto;


import java.util.Optional;

public interface UserPersistence{

    UserDataRto saveUser(UserDataRto userData);
    Optional<UserDataRto> getUser(String userName);
    boolean userExistOrNot(String userName);
}

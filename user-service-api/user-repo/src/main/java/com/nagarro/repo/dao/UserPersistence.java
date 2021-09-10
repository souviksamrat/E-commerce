package com.nagarro.repo.dao;


import com.nagarro.repo.rto.auth.UserDetailsRto;

import java.util.Optional;

public interface UserPersistence{

    UserDetailsRto saveUser(UserDetailsRto userData);

}

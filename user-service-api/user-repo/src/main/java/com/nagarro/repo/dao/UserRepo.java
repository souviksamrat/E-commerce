package com.nagarro.repo.dao;


import com.nagarro.repo.rto.UserDataRto;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDataRto,String> {
}

package com.nagarro.resource.transformer;

import com.nagarro.models.auth.UserAuthData;
import com.nagarro.resource.rto.UserAuthRto;

import java.util.Optional;
import java.util.function.Function;

public class UserAuthDataTransformer implements Function<UserAuthRto, UserAuthData> {
    @Override
    public UserAuthData apply(UserAuthRto userAuthRto) {
        UserAuthData userAuthData=new UserAuthData();
        Optional.ofNullable(userAuthData.getUserId()).ifPresent(userAuthRto::setUserId);

        return userAuthData;
    }
}

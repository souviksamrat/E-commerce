package com.nagarro.resource.transformer;

import com.nagarro.models.user.personalInformation.UserInformation;
import com.nagarro.resource.rto.UserDetailsRto;

import java.util.function.Function;

public class UserDetailsTransformer implements Function<UserDetailsRto, UserInformation> {

    @Override
    public UserInformation apply(UserDetailsRto userDetailsRto) {
        return null;
    }
}

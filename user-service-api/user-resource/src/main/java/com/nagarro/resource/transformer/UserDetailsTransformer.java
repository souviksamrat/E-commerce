package com.nagarro.resource.transformer;

import com.nagarro.models.user.UserData;
import com.nagarro.resource.rto.UserDetailsRto;

import java.util.function.Function;

public class UserDetailsTransformer implements Function<UserDetailsRto, UserData> {

    @Override
    public UserData apply(UserDetailsRto userDetailsRto) {
        return null;
    }
}

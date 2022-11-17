package com.example.mobileappws.userservice.impl;

import com.example.mobileappws.model.responce.UserDetailsRequestModel;
import com.example.mobileappws.model.responce.UserRest;
import com.example.mobileappws.shared.Utils;
import com.example.mobileappws.storage.MapStorage;
import com.example.mobileappws.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    MapStorage users;
    Utils utils;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());

        String userId = utils.generateUserId();
        returnValue.setUserId(userId);

        users.put(userId, returnValue);

        return returnValue;
    }
}

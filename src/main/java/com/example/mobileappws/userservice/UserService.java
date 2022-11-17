package com.example.mobileappws.userservice;

import com.example.mobileappws.model.responce.UserDetailsRequestModel;
import com.example.mobileappws.model.responce.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}

package com.example.mobileappws.controller;

import com.example.mobileappws.model.responce.UserRest;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "50") int limit,
                           @RequestParam(value = "sort", required = false) String sort) {
        return "get user was called with page = " + page + " and limit = " + limit + " and sort = " + sort;
    }

    @GetMapping(path = "/{userId}", produces = {
            MediaType.APPLICATION_XML_VALUE ,
            MediaType.APPLICATION_JSON_VALUE
    })
    public UserRest getUser(@PathVariable String userId) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail("test@test.com");
        returnValue.setFirstName("John");
        returnValue.setLastName("Doe");

        return returnValue;
    }

    @GetMapping(path = "/user1/{userId}", produces = {
            MediaType.APPLICATION_XML_VALUE ,
            MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity<UserRest> getUserResponse(@PathVariable String userId) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail("test@test.com");
        returnValue.setFirstName("John");
        returnValue.setLastName("Doe");

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.BAD_REQUEST);
    }

    @PostMapping
    public String createUser() {
        return "create user was called";
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}

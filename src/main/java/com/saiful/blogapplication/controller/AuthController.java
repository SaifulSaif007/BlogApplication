package com.saiful.blogapplication.controller;

import com.google.firebase.auth.UserRecord;
import com.saiful.blogapplication.service.AuthService;
import com.saiful.blogapplication.viewmodel.Result;
import com.saiful.blogapplication.viewmodel.auth.create.CreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {


    @Autowired
    private AuthService authService;


    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Result<UserRecord> CreateUser(@RequestBody CreateRequest request) {
        return authService.createUser(request.email, request.password, request.displayName);
    }

}

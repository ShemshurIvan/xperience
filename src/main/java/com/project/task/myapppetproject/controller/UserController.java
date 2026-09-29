package com.project.task.myapppetproject.controller;

import com.project.task.myapppetproject.dto.user.UserRequest;
import com.project.task.myapppetproject.dto.user.UserResponse;
import com.project.task.myapppetproject.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserResponse> createUser(@RequestBody @Valid UserRequest userRequest) {
        UserResponse response = userService.createUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

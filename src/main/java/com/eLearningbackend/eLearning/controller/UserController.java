package com.eLearningbackend.eLearning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eLearningbackend.eLearning.interfaces.UserInterface;
import com.eLearningbackend.eLearning.models.User;

import jakarta.annotation.PostConstruct;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {

    UserInterface userInterface;

    public UserController(UserInterface userInterface) {
        super();
        this.userInterface = userInterface;
    }

    @PostConstruct
    public void onInitRoleAndUser() {
        userInterface.onInitRoleAndUser();
    }

    @PostMapping({ "create" })
    public ResponseEntity<User> create(User user) {
        return new ResponseEntity<User>(userInterface.create(user), HttpStatus.CREATED);
    }

}

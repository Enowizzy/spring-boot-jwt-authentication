package com.eLearningbackend.eLearning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eLearningbackend.eLearning.interfaces.UserInterface;
import com.eLearningbackend.eLearning.models.User;
import com.eLearningbackend.eLearning.repositories.UserRepository;

import jakarta.annotation.PostConstruct;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {

    UserInterface userInterface;
    UserRepository userRepository;

    public UserController(UserInterface userInterface, UserRepository userRepository) {
        super();
        this.userInterface = userInterface;
        this.userRepository = userRepository;

    }

    @PostConstruct
    public void onInitRoleAndUser() {
        userInterface.onInitRoleAndUser();
    }

    @PostMapping({ "create" })
    public ResponseEntity<User> create(User user) {
        return new ResponseEntity<User>(userInterface.create(user), HttpStatus.CREATED);
    }

    @GetMapping({ "signin" })
    public ResponseEntity<User> login(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return new ResponseEntity<User>(userInterface.getUserByEmail(user), HttpStatus.OK);
        }
        return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);

    }

}

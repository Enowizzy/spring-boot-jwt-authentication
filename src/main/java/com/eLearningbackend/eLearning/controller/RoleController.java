package com.eLearningbackend.eLearning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eLearningbackend.eLearning.interfaces.RoleInterface;
import com.eLearningbackend.eLearning.models.Role;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/role")
public class RoleController {

    RoleInterface roleInterface;

    public RoleController(RoleInterface roleInterface) {
        super();
        this.roleInterface = roleInterface;
    }

    @PostMapping({ "/create" })
    public ResponseEntity<Role> create(Role role) {
        return new ResponseEntity<Role>(roleInterface.create(role), HttpStatus.CREATED);
    }
}
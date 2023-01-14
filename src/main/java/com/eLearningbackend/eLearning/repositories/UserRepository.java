package com.eLearningbackend.eLearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eLearningbackend.eLearning.models.Role;
import com.eLearningbackend.eLearning.models.User;

public interface UserRepository extends JpaRepository<User, String> {

    void save(Role adminRole);

}
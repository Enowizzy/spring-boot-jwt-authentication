package com.eLearningbackend.eLearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eLearningbackend.eLearning.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}

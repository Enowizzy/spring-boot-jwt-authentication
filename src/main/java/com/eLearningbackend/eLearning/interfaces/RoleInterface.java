package com.eLearningbackend.eLearning.interfaces;

import java.util.List;

import com.eLearningbackend.eLearning.models.Role;

public interface RoleInterface {
    Role create(Role role);

    List<Role> getRoles();

    Role getRoleById(long id);

    Role updateRole(Role role, String roleName);

    void deleteRole(String roleName);
}

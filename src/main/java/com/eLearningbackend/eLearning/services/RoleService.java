package com.eLearningbackend.eLearning.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eLearningbackend.eLearning.interfaces.RoleInterface;
import com.eLearningbackend.eLearning.models.Role;
import com.eLearningbackend.eLearning.repositories.RoleRepository;

@Service
public class RoleService implements RoleInterface {

    public RoleService(RoleRepository roleRepository) {
        super();
        this.roleRepository = roleRepository;
    }

    private RoleRepository roleRepository;

    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getRoles() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Role getRoleById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Role updateRole(Role role, String roleName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteRole(String roleName) {
        // TODO Auto-generated method stub

    }
}

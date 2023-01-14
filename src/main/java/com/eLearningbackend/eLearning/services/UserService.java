package com.eLearningbackend.eLearning.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.eLearningbackend.eLearning.interfaces.UserInterface;
import com.eLearningbackend.eLearning.models.Role;
import com.eLearningbackend.eLearning.models.User;
import com.eLearningbackend.eLearning.repositories.UserRepository;

@Service
public class UserService implements UserInterface {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public void onInitRoleAndUser() {
        Role adminRole = new Role();
        adminRole.setRoleName("admin");
        adminRole.setRoleDescription("Admin for E-learning Web Application");
        userRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("user");
        userRole.setRoleDescription("User for E-learning Web Application");
        userRepository.save(userRole);

        User adminUser = new User();
        adminUser.setFirstName("JavaX");
        adminUser.setLastName("JeedieX");
        adminUser.setEmail("javax@jeediex.com");
        adminUser.setPassword("<JeedieX@JavaDevelopment/>");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

        User user = new User();
        user.setFirstName("JavaDev");
        user.setLastName("JeedieX");
        user.setEmail("javax@jeediex.com");
        user.setPassword("<JeedieX@JavaDevelopment/>");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userRepository.save(user);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getUserById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User updateUser(User user, Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub

    }

}

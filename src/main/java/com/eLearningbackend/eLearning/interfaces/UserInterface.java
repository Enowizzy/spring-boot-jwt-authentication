package com.eLearningbackend.eLearning.interfaces;

import java.util.List;

import com.eLearningbackend.eLearning.models.User;

public interface UserInterface {
    void onInitRoleAndUser();

    User create(User user);

    List<User> getUsers();

    User getUserById(long id);

    User getUserByEmail(User user);

    User updateUser(User user, Long id);

    void deleteUser(Long id);
}

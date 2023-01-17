package com.eLearningbackend.eLearning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eLearningbackend.eLearning.models.User;
import com.eLearningbackend.eLearning.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  UserRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String firstName)  {
    User user = userRepository.findByFirstName(firstName);
    
    return UserDetailsImpl.build(user);
  }

}
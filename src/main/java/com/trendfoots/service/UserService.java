package com.trendfoots.service;

import com.trendfoots.entity.User;
import com.trendfoots.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User updatedUser){

        User user = userRepository.findById(id).orElse(null);

        if(user != null){

            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());

            return userRepository.save(user);
        }

        return null;
    }

}
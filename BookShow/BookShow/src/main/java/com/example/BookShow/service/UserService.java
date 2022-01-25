package com.example.BookShow.service;

import com.example.BookShow.entity.User;
import com.example.BookShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public boolean existsById(String userName) {
        return userRepository.existsById(userName);
    }

    public User findUserByUserName(String userName) {
        return userRepository.getById(userName);
    }

}

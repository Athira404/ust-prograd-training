package com.example.BookTicket.service;

import com.example.BookTicket.entity.User;
import com.example.BookTicket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User saveNewUser(User user) {
        return userRepository.save(user);
    }

    public boolean existsById(String userName) {
        return userRepository.existsById(userName);
    }

    public User findUserByUserName(String userName) {
        return userRepository.getById(userName);
    }
}

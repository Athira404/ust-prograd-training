package com.example.security.controller;

import com.example.security.entity.User;
import com.example.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class AuthController {
    @Autowired
    UserService service;
    @GetMapping("auth/login")
    public String LoginForm() {
        return "login";
    }

    @PostMapping("auth/login")
    public String login(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        User user=service.getUserByUserName(userName);

        if(user.getPassword().equals(password)){
            return "redirect:/home";
        }
        return "login";
    }
}

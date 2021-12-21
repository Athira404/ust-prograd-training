package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")/// --> home page
    public String print() {
        return"Home page";
    }
    @RequestMapping("/about")
    public String printAbout(){
        return "About page";
    }
}

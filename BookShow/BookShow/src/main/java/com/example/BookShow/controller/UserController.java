package com.example.BookShow.controller;

import com.example.BookShow.entity.Movie;
import com.example.BookShow.entity.User;
import com.example.BookShow.service.MovieService;
import com.example.BookShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MovieService movieService;


    @GetMapping({"/home", "/"})
    public String homePage() {
        return "home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signup")
    public String registerPage() {
        return "signup";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/movies")
    public String movies() {
        return "movies";
    }

    @PostMapping("/signup")
    public String registerUser(Model model, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String mobileNumber = request.getParameter("mobileNumber");
        String password = request.getParameter("password");

//
//        model.addAttribute("userName", userName);
//        model.addAttribute("age", age);
//        model.addAttribute("gender", gender);
//        model.addAttribute("email", email);
//        model.addAttribute("mobileNumber", mobileNumber);
//        model.addAttribute("password", password);


        User user = new User(userName, age, gender, email, mobileNumber, password);
        userService.saveUser(user);

        model.addAttribute("success", "Registered Successfully!");

        return "login";
    }

    @PostMapping("/login")
    public String userLogin(Model model, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        User user = userService.findUserByUserName(userName);
        System.out.println(userService.findUserByUserName(userName));
        if (userService.existsById(userName)) {
            System.out.println(userName);
            if (Objects.equals(password, user.getPassword())){
//            if (password.equals(user.getPassword())) {
                model.addAttribute("message", "Logged in Successfully!!");
                model.addAttribute("userName", userName);
//                model.addAttribute("age", user.getAge());
//                model.addAttribute("gender", user.getGender());
//                model.addAttribute("email", user.getEmail());
//                model.addAttribute("mobileNumber", user.getMobileNumber());
//                model.addAttribute("password", user.getPassword());
//                model.addAttribute("movies", movieService.movieList());
            } else {
                model.addAttribute("message", "Invalid Password");
                return "login";
            }

        } else {
            model.addAttribute("message", "Invalid Username");
            return "login";
        }
        return "movies";
    }

    @RequestMapping("seatBooking")
    public String ticketBooking(){
        return "seatBooking";
    }

    @GetMapping("booked")
    public String booked(){
        return "booked";
    }

}


//    @PostMapping("/movies")
//    public String movies(HttpServletRequest request, Model model){
//        User registeredUser;
//        String Athira="Athira";
//        registeredUser = userService.findUserByUserName("Athira");
//        model.addAttribute("userName", registeredUser.getUserName());
//        return "movies";






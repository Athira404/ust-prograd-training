package com.example.BookTicket.controller;

import com.example.BookTicket.entity.User;
import com.example.BookTicket.service.UserService;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

/* get mapping --> get anything from the server and  view it from the browser

post mapping --> get details from the client
             --> add data in db
 */


@Controller
public class UserController {

    @Autowired
    UserService userService;
//    @Autowired
//    MovieService movieService;

    @GetMapping({"/home","/"})
    public String homePage(){
        return "home";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

    @PostMapping("/login")
    public String userRegistration(HttpServletRequest request, Model model){
        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String password = request.getParameter("password");

        User user = new User(userName, email, phoneNumber, password);
        userService.saveNewUser(user);
        return "login";
    }

    @GetMapping("/movies")
    public String moviesLists(Model model){
//        model.addAttribute("movies", movieService.movieList());
        return "home";
    }

    @PostMapping("/movies")
    public String userLogin(HttpServletRequest request, Model model){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user;
        if(userService.existsById(userName)){
            user = userService.findUserByUserName(userName);
            if(password.equals(user.getPassword())){
                model.addAttribute("userName", userName);
//                model.addAttribute("movies", movieService.movieList());
            }
            else{
                model.addAttribute("message", "Invalid Password!");
                return "login";
            }
        }
        else{
            model.addAttribute("message", "Invalid UserName!");
            return "login";
        }
        return "movies";
    }
}

//package com.example.BookShow.controller;
//
//import com.example.BookShow.entity.Movie;
//import com.example.BookShow.service.MovieService;
//import com.example.BookShow.service.MovieShowService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class ShowMovieController {
//    @Autowired
//    private MovieShowService movieShowsService;
//    @Autowired
//    private MovieService movieService;
//
//
//    @GetMapping("/{userName}/movie/{movieId}")
//    public String movieShows(@PathVariable String userName, @PathVariable Long movieId, Model model){
//        model.addAttribute("shows", movieShowsService.showsDetails(movieId));
//        model.addAttribute("userName", userName);
//        Movie movie = movieService.getByMovieId(movieId);
//        model.addAttribute("movieName", movie.getName());
//        return "movieShows";
//    }
//
//}

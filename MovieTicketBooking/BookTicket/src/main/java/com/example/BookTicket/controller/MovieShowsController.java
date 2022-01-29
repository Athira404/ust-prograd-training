package com.example.BookTicket.controller;

import com.example.BookTicket.entity.Movie;
import com.example.BookTicket.service.MovieService;
import com.example.BookTicket.service.MovieShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MovieShowsController {
    @Autowired
    MovieShowsService movieShowsService;
    @Autowired
    MovieService movieService;

    @GetMapping("/{userName}/movie/{id}")//id/movieId
    public String movieShows(@PathVariable String userName, @PathVariable Long id, Model model){
        model.addAttribute("shows", movieShowsService.showDetails(id));
        model.addAttribute("userName", userName);
        Movie movie = movieService.getMovieByMovieId(id);
        model.addAttribute("movieName", movie.getMovieName());
        return "movieShows";
    }
}

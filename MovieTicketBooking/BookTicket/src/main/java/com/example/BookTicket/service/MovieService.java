package com.example.BookTicket.service;

import com.example.BookTicket.entity.Movie;
import com.example.BookTicket.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    public MovieRepository movieRepository;


    public Movie getMovieByMovieId(Long movieId) {
        return movieRepository.findById(movieId).get();
    }
}

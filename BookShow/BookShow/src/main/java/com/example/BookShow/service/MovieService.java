package com.example.BookShow.service;

import com.example.BookShow.entity.Movie;
import com.example.BookShow.entity.User;
import com.example.BookShow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;


    public List<Movie> movieList(){
        return movieRepository.findAll();
    }

    public Movie getByMovieId(Long movieId){
        return movieRepository.getById(movieId);
    }
}

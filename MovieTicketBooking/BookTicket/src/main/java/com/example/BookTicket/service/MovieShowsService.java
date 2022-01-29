package com.example.BookTicket.service;

import com.example.BookTicket.entity.Movie;
import com.example.BookTicket.entity.MovieShows;
import com.example.BookTicket.repository.MovieShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowsService {
    @Autowired
    MovieShowsRepository movieShowsRepository;


    public List<MovieShows> showDetails(Long id) {
        return movieShowsRepository.findMovieByMovieId(id);
    }

    public MovieShows getById(Long id) {
        return movieShowsRepository.getById(id);
    }
}

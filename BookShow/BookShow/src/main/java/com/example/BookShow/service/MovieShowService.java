package com.example.BookShow.service;

import com.example.BookShow.entity.MovieShow;
import com.example.BookShow.repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowService {
    @Autowired
    private MovieShowRepository movieShowRepository;

    public List<MovieShow> showsDetails(Long movieId){
        return movieShowRepository.findByMovieMovieId(movieId);
    }

    public List<MovieShow> showsList(){
        return movieShowRepository.findAll();
    }
    public MovieShow getById(Long id){
        return movieShowRepository.getById(id);
    }
    public  Boolean existsById(Long id){
        return movieShowRepository.existsById(id);
    }
}

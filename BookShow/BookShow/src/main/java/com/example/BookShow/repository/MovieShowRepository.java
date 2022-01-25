package com.example.BookShow.repository;

import com.example.BookShow.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieShowRepository extends JpaRepository<MovieShow, Long> {
    public List<MovieShow> findByMovieMovieId(Long MovieId);
}


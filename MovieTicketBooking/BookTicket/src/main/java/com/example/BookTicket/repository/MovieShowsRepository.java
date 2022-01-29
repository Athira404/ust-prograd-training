package com.example.BookTicket.repository;

import com.example.BookTicket.entity.MovieShows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieShowsRepository extends JpaRepository<MovieShows, Long> {
    List<MovieShows> findMovieByMovieId(Long movieId);
}

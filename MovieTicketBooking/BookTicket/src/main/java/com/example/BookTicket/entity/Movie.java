package com.example.BookTicket.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
//import java.util.Date;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;



    @Column(nullable = false)
    private String movieName;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private Date releaseDate;


    public List<MovieShows> getMovieShows() {
        return movieShows;
    }

    public void setMovieShows(List<MovieShows> movieShows) {
        this.movieShows = movieShows;
    }

    @OneToMany(mappedBy = "movie")
    private List<MovieShows> movieShows;


    public Movie() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

//    public List<MovieShows> getMovieShows() {
//        return movieShows;
//    }
//
//    public void setMovieShows(List<MovieShows> movieShows) {
//        this.movieShows = movieShows;
//    }

    public Movie(String movieName, String genre, Date releaseDate) {
        this.movieName = movieName;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }
}

package com.example.BookShow.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long movieId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private double rating;

    @OneToMany(mappedBy = "movie")
    private List<MovieShow> movieShows;

    public Movie() {
    }

    public Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + movieId +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Long getId() {
        return movieId;
    }

    public void setId(Long id) {
        this.movieId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

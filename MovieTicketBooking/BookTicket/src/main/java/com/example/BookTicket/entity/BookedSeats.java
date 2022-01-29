package com.example.BookTicket.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookedSeats {
    @Id
    private Long id;
    @Column(nullable = false)
    private String seats;
    @Column(nullable = false)
    private double price;

    @JsonIgnore
    @ManyToOne
    private User user;

    @JsonIgnore
    @ManyToOne
    private MovieShows movieShows;

    public BookedSeats() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeat() {
        return seats;
    }

    public void setSeat(String seat) {
        this.seats = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MovieShows getMovieShows() {
        return movieShows;
    }

    public void setMovieShows(MovieShows movieShows) {
        this.movieShows = movieShows;
    }

    public BookedSeats(String seat, double price) {
        this.seats = seat;
        this.price = price;
    }
}

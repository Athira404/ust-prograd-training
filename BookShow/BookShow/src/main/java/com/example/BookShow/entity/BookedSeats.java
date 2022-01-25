package com.example.BookShow.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookedSeats {
    @Id
    @GeneratedValue
    private Long id;
    private String seat;
    private Double seatPrice;
    @JsonIgnore
    @ManyToOne
    private User user;

    @JsonIgnore
    @ManyToOne
    private MovieShow movieShows;

    public BookedSeats(String seat, Double seatPrice) {
        this.seat = seat;
        this.seatPrice = seatPrice;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public BookedSeats() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeats() {
        return seat;
    }

    public void setSeats(String seat) {
        this.seat = seat;
    }

    public Double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(Double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public User getCustomer() {
        return user;
    }

    public void setCustomer(User customer) {
        this.user = customer;
    }

    public MovieShow getMovieShows() {
        return movieShows;
    }

    public void setMovieShows(MovieShow movieShows) {
        this.movieShows = movieShows;
    }

    public BookedSeats(String seat, Double seatPrice, User customer, MovieShow movieShows) {
        this.seat = seat;
        this.seatPrice = seatPrice;
        this.user = customer;
        this.movieShows = movieShows;
    }

    @Override
    public String toString() {
        return "BookedSeats{" +
                "id=" + id +
                ", seat='" + seat + '\'' +
                ", seatPrice=" + seatPrice +
                ", customer=" + user +
                ", movieShows=" + movieShows +
                '}';
    }
}

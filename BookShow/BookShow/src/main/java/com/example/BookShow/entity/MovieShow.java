package com.example.BookShow.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class MovieShow {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Date showDate;
    @Column(nullable = false)
    private Time showTime;

    @JsonIgnore
    @ManyToOne
    private Movie movie;
    @OneToMany(mappedBy = "movieShows")
    private List<BookedSeats> bookedSeats;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public Time getShowTime() {
        return showTime;
    }

    public void setShowTime(Time showTime) {
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    @Override
    public String toString() {
        return "MovieShow{" +
                "id=" + id +
                ", showDate=" + showDate +
                ", showTime=" + showTime +
                ", movie=" + movie +
                ", bookedSeats=" + bookedSeats +
                '}';
    }



    public MovieShow(Date showDate, Time showTime, Movie movie, List<BookedSeats> bookedSeats) {
        this.showDate = showDate;
        this.showTime = showTime;
        this.movie = movie;
        this.bookedSeats = bookedSeats;
    }

    public MovieShow() {
    }




}

package com.example.BookShow.entity;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue
    private Long id;
    private String seats;
    private Double price;


//    @ManyToOne
//    private MovieShow movieshows;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Seat(String seats, Double price) {
        this.seats = seats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", seats='" + seats + '\'' +
                ", price=" + price +
                '}';
    }
}

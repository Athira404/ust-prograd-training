package com.example.BookTicket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seats {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String seats;
    @Column(nullable = false)
    private double price;

    public Seats() {
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

    public Seats(String seat, double price) {
        this.seats = seat;
        this.price = price;
    }
}

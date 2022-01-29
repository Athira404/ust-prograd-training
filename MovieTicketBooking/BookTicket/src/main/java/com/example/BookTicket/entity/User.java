package com.example.BookTicket.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    private String userName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<BookedSeats> bookedSeats;

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userName, String email, String phoneNumber, String password) {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}

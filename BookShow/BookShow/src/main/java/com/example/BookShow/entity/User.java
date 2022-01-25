package com.example.BookShow.entity;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Entity
public class User {
    @Id
    private String userName;
    @Column(nullable = false)
    private int age;
    private String gender;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String mobileNumber;
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<BookedSeats> bookedSeats;

    public User(String userName, int age, String gender, String email, String mobileNumber, String password) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }
    public User(){}



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}


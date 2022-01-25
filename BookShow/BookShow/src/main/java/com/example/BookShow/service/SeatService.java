package com.example.BookShow.service;

import com.example.BookShow.entity.Seat;
import com.example.BookShow.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    public SeatRepository seatRepository;

    public Seat getBySeats(String seats) {
        return seatRepository.getBySeats(seats);
    }
}

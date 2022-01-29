package com.example.BookTicket.service;

import com.example.BookTicket.entity.Seats;
import com.example.BookTicket.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatsService {
    @Autowired
    SeatsRepository seatsRepository;


    public Seats getBySeats(String seats){
        return seatsRepository.getBySeats(seats);
    }
}

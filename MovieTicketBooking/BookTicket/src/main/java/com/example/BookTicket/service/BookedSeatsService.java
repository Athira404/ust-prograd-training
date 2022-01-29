package com.example.BookTicket.service;

import com.example.BookTicket.entity.BookedSeats;
import com.example.BookTicket.repository.BookedSeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedSeatsService {
    @Autowired
    BookedSeatsRepository bookedSeatsRepository;

    public BookedSeats getBySeatAndMovieShowsId(String seat, Long id) {
        return bookedSeatsRepository.getBySeatsAndMovieShowsId(seat, id);
    }

    public BookedSeats saveSeat(BookedSeats bookedSeats){
        return bookedSeatsRepository.save(bookedSeats);
    }

    public List<BookedSeats> findUserByUserName(String userName){
        return bookedSeatsRepository.findByUserUserName(userName);
    }
}


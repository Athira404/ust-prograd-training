package com.example.BookTicket.repository;

import com.example.BookTicket.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookedSeatsRepository extends JpaRepository<BookedSeats, Long> {
    public List<BookedSeats> findByUserUserName(String userName);
    public BookedSeats getBySeatsAndMovieShowsId(String seats, Long id);
}

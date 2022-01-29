package com.example.BookTicket.repository;

import com.example.BookTicket.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    Seats getBySeats(String seats);
}

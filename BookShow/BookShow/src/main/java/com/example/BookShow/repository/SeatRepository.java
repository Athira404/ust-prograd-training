package com.example.BookShow.repository;

import com.example.BookShow.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    public Seat getBySeats(String seats);
}

package com.example.BookShow.repository;

import com.example.BookShow.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatRepository extends JpaRepository<BookedSeats, Long> {

}

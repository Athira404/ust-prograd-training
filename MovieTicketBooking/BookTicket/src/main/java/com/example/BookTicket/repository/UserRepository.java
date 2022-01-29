package com.example.BookTicket.repository;

import com.example.BookTicket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

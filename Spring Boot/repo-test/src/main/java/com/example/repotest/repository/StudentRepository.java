package com.example.repotest.repository;

import com.example.repotest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("" +
            "SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END " +
            "FROM Student s WHERE s.email = ?1" //?1 is for one parameter, here it is String email
    )

    public Boolean existsByEmail(String email);
//write tests to check it works fine without any bugs
    //hehe you wrote it manually so write test

}

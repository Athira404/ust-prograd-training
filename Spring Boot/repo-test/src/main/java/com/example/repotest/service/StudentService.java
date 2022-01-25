package com.example.repotest.service;

import com.example.repotest.entity.Student;
import com.example.repotest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Boolean checkIfEmailExists(String email) {
        return studentRepository.existsByEmail(email);
    }
}

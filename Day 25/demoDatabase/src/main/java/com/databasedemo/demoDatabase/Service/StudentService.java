package com.databasedemo.demoDatabase.Service;

import com.databasedemo.demoDatabase.Student;
import com.databasedemo.demoDatabase.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }


    public List<Student> listAll() {
        return repository.findAll();
    }
}

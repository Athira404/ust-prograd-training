package com.example.relations.service;

import com.example.relations.entity.Faculty;
import com.example.relations.entity.Student;
import com.example.relations.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty getFacultyById(Long facultyId) {
        return facultyRepository.findById(facultyId).get();
    }
}

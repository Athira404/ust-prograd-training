package com.example.relations.controller;


//Relations --> connections

import com.example.relations.entity.Faculty;
import com.example.relations.entity.Student;
import com.example.relations.service.FacultyService;
import com.example.relations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("/faculties")
    public List<Faculty> list(){
        return facultyService.getAllFaculties();
    }

    @GetMapping("/faculty/new")//localhost:3000/student/new?name=some&age=xx
    public Faculty create(HttpServletRequest request){
        String name= request.getParameter("name");
        Faculty faculty = new Faculty(name);
        return facultyService.saveFaculty(faculty);
    }
    @GetMapping("/faculty/{id}")
    public Faculty getFaculty(@PathVariable Long id){
        return facultyService.getFacultyById(id);
    }
}
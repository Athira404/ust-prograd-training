package com.example.repotest.controller;

import com.example.repotest.entity.Student;
import com.example.repotest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> listAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/new")
    public Student create(HttpServletRequest request){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer age = Integer.parseInt(request.getParameter("age"));

        Student student= new Student(name, email,age);
        return studentService.createStudent(student);
    }
    @GetMapping("/students/check/email/{email}")
    public Boolean checkEmail(@PathVariable String email){
        return studentService.checkIfEmailExists(email);
    }
//    http://localhost:8091/students/check/email/athira123@gmail.com
}

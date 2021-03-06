package com.example.relations.controller;

import com.example.relations.entity.Course;
import com.example.relations.entity.Faculty;
import com.example.relations.entity.Student;
import com.example.relations.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> list(){
        return courseService.getAllCourses();
    }

    @GetMapping("/course/new")//localhost:3000/course/new?name=some
    public Course create(HttpServletRequest request){
        String name= request.getParameter("name");
        Course course = new Course(name);
        return courseService.save(course);
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Long id){
        return courseService.getCourseById(id);
    }
}

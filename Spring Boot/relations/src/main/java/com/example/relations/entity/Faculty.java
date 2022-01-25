package com.example.relations.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

//Faculty - student --> one to many
//faculty --> id, name
//student --> id, name, age, faculty id
@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "faculty")
//    bi directional only in java side not db side, and here we are telling that we already did many to one(mapping)
//    once, so thats why adding mapped by in line 19
    //it will go infinity so add @JsonIgnore before many to one in student
    //i) this mapped by faculty goes to student entity
    private List<Student> students;


    public Faculty() {
    }

    public Faculty(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

package com.deep.studentms.controller;


import java.util.List;

import com.deep.studentms.model.Student;
import com.deep.studentms.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentServices service;
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return service.saveStudent(s);
    }

    @GetMapping
    public List<Student> getStudents(){
        return service.getAllStudents();
    }
}

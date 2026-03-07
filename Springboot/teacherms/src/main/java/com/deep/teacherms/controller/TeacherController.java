package com.deep.teacherms.controller;


import java.util.List;

import com.deep.teacherms.dto.StudentDTO;
import com.deep.teacherms.model.Teacher;
import com.deep.teacherms.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService service;

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher t){
        return service.saveTeacher(t);
    }

    @GetMapping
    public List<Teacher> getTeachers(){
        return service.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable Long id){
        return service.getTeacher(id);
    }
    @GetMapping("/students/{id}")
    public StudentDTO getStudent(@PathVariable Long id){
        return service.getStudentDetails(id);
    }
}

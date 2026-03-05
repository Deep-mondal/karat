package com.deep.studentms.services;


import java.util.List;

import com.deep.studentms.model.Student;
import com.deep.studentms.repository.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentServices {

    @Autowired
    StudentRepositary repo;

    public Student saveStudent(Student s){
        return repo.save(s);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }
}

package com.deep.teacherms.services;



import java.util.List;

import com.deep.teacherms.model.Teacher;
import com.deep.teacherms.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TeacherService {

    @Autowired
    TeacherRepository repo;

    public Teacher saveTeacher(Teacher t){
        return repo.save(t);
    }

    public List<Teacher> getAllTeachers(){
        return repo.findAll();
    }

    public Teacher getTeacher(Long id){
        return repo.findById(id).orElse(null);
    }
}

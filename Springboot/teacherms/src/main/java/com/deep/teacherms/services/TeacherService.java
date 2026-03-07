package com.deep.teacherms.services;



import java.util.List;

import com.deep.teacherms.dto.StudentDTO;
import com.deep.teacherms.model.Teacher;
import com.deep.teacherms.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TeacherService {

    @Autowired
    TeacherRepository repo;
    @Autowired
    private RestTemplate restTemplate;

    public Teacher saveTeacher(Teacher t){
        return repo.save(t);
    }

    public List<Teacher> getAllTeachers(){
        return repo.findAll();
    }

    public Teacher getTeacher(Long id){
        return repo.findById(id).orElse(null);
    }
    public StudentDTO getStudentDetails(Long id){
        String url="http://studentms/students/"+id;
        StudentDTO student=restTemplate.getForObject(url,StudentDTO.class);
        return student;
    }
}

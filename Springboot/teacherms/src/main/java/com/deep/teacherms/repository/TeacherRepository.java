package com.deep.teacherms.repository;



import com.deep.teacherms.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}

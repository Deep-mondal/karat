package com.deep.studentms.repository;


import com.deep.studentms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepositary extends JpaRepository<Student, Long> {

}
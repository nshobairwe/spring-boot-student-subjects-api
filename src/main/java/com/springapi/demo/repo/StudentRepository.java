package com.springapi.demo.repo;

import com.springapi.demo.model.Student;
import com.springapi.demo.projection.StudentProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {
    List<StudentProjection> findAllProjectedBy();
}


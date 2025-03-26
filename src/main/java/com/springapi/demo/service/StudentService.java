package com.springapi.demo.service;

import com.springapi.demo.projection.StudentProjection;
import com.springapi.demo.repo.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<StudentProjection> getAllStudents() {
        return repository.findAllProjectedBy();
    }
}


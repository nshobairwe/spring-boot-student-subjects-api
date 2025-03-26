package com.springapi.demo.controller;

import com.springapi.demo.projection.StudentProjection;
import com.springapi.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentProjection> getStudents() {
        return studentService.getAllStudents();
    }
}


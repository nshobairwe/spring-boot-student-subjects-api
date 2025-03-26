package com.springapi.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String program;

    // Constructors
    public Student() {}

    public Student(String name, String program) {
        this.name = name;
        this.program = program;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }
}

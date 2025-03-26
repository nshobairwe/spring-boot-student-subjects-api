package com.springapi.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int year;
    private int semester;

    public Subject() {}

    public Subject(String name, int year, int semester) {
        this.name = name;
        this.year = year;
        this.semester = semester;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getYear() { return year; }
    public int getSemester() { return semester; }

    public void setName(String name) { this.name = name; }
    public void setYear(int year) { this.year = year; }
    public void setSemester(int semester) { this.semester = semester; }
}

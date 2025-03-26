package com.springapi.demo.service;

import com.springapi.demo.model.Subject;
import com.springapi.demo.repo.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SubjectService {
    private final SubjectRepository repository;

    public SubjectService(SubjectRepository repository) {
        this.repository = repository;
    }

    public Map<Integer, List<Map<String, Object>>> getAllSubjects() {
        return repository.findAll().stream()
                .collect(Collectors.groupingBy(
                        Subject::getYear,
                        Collectors.mapping(subject -> Map.of(
                                "semester", subject.getSemester(),
                                "subjects", subject.getName()
                        ), Collectors.toList())
                ));
    }
}


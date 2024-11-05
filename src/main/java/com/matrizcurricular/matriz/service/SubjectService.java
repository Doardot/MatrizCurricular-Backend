package com.matrizcurricular.matriz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrizcurricular.matriz.entity.Subject;
import com.matrizcurricular.matriz.repository.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository repository;

    public List<Subject> findAll() {
        return repository.findAll();
    }
}

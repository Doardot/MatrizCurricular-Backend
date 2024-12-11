package com.matrizcurricular.matriz.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrizcurricular.matriz.infra.repository.entities.Subject;
import com.matrizcurricular.matriz.infra.repository.interfaceJPA.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository repository;

    public List<Subject> findAll() {
        return repository.findAll();
    }
}

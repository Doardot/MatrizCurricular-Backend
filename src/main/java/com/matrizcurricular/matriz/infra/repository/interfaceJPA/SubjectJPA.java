package com.matrizcurricular.matriz.infra.repository.interfaceJPA;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.matrizcurricular.matriz.infra.repository.entities.Subject;

public interface SubjectJPA extends CrudRepository<Subject, String> {
    Optional<Subject> findById(String creditCode);
}

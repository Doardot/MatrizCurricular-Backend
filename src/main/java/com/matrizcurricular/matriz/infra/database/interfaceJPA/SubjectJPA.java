package com.matrizcurricular.matriz.infra.database.interfaceJPA;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.matrizcurricular.matriz.infra.database.entities.Subject;

public interface SubjectJPA extends CrudRepository<Subject, String> {
    Optional<Subject> findById(String creditCode);
}

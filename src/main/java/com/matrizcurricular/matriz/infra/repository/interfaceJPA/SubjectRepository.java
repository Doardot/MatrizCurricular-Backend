package com.matrizcurricular.matriz.infra.repository.interfaceJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrizcurricular.matriz.infra.repository.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    
}

package com.matrizcurricular.matriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrizcurricular.matriz.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    
}

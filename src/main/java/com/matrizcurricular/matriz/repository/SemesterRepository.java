package com.matrizcurricular.matriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrizcurricular.matriz.entity.Semester;

public interface SemesterRepository extends JpaRepository<Semester, Long> {
    
}

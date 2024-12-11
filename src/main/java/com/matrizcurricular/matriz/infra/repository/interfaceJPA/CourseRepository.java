package com.matrizcurricular.matriz.infra.repository.interfaceJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrizcurricular.matriz.infra.repository.entities.Course;

public interface CourseRepository extends JpaRepository<Course, String> {
    
}

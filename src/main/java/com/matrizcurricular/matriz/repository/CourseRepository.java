package com.matrizcurricular.matriz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrizcurricular.matriz.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}

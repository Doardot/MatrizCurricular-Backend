package com.matrizcurricular.matriz.infra.database.interfaceJPA;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.matrizcurricular.matriz.infra.database.entities.Course;

public interface CourseJPA extends CrudRepository<Course, String> {
   Optional<Course> findById(String curriculumCode);
}

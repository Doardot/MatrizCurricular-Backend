package com.matrizcurricular.matriz.infra.repository.interfaceJPA;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.matrizcurricular.matriz.infra.repository.entities.CourseSubject;

public interface CourseSubjectJPA extends CrudRepository<CourseSubject, Long> {
   List<CourseSubject> findAll();
}

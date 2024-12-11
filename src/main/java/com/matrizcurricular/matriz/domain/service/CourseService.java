package com.matrizcurricular.matriz.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrizcurricular.matriz.infra.repository.entities.Course;
import com.matrizcurricular.matriz.infra.repository.interfaceJPA.CourseRepository;

@Service
public class CourseService {
    private CourseRepository repository;

    public CourseService(CourseRepository courseRepository){
        this.repository = courseRepository;
    }

    public List<Course> findAll(){
        return repository.findAll();
    }
}

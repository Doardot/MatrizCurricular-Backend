package com.matrizcurricular.matriz.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrizcurricular.matriz.domain.interfaceRepository.ICourseRepository;
import com.matrizcurricular.matriz.domain.models.CourseModel;

@Service
public class CourseService {
    private ICourseRepository repository;

    public CourseService(ICourseRepository courseRepository) {
        this.repository = courseRepository;
    }

    public CourseModel getCourseByCurriculum(String curriculum) {
        return repository.getCourseByCurriculum(curriculum);
    }

    public List<CourseModel> getAllCourses() {
        return repository.getAllCourses();
    }
}

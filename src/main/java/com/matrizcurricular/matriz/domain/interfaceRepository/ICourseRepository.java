package com.matrizcurricular.matriz.domain.interfaceRepository;

import java.util.List;

import com.matrizcurricular.matriz.domain.models.CourseModel;

public interface ICourseRepository {
   CourseModel getCourseByCurriculum(String curriculum);

   List<CourseModel> getAllCourses();
}
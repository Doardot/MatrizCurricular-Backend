package com.matrizcurricular.matriz.domain.interfaceRepository;

import com.matrizcurricular.matriz.domain.models.CourseModel;

public interface ICourseRepository {
   CourseModel getCourseByCurriculum(String curriculum);
}
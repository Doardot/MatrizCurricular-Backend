package com.matrizcurricular.matriz.application.useCase;

import java.util.List;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.CourseSubjectDTO;
import com.matrizcurricular.matriz.domain.service.CourseSubjectService;
import com.matrizcurricular.matriz.infra.repository.adapters.CourseSubjectAdapter;

@Component
public class GetCourseSubByCourseUC {
   private CourseSubjectService courseService;

   public GetCourseSubByCourseUC(CourseSubjectService courseService) {
      this.courseService = courseService;
   }

   public List<CourseSubjectDTO> run(String curriculumCode) {
      return courseService.getCourseSubjectByCourse(curriculumCode).stream().map(cs -> CourseSubjectAdapter.toDTO(cs))
            .toList();
   }
}

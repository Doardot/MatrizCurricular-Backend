package com.matrizcurricular.matriz.application.useCase;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.response.CourseDTO;
import com.matrizcurricular.matriz.domain.service.CourseService;
import com.matrizcurricular.matriz.infra.adapters.CourseAdapter;

@Component
public class GetCourseByCurriculumUC {
   private CourseService courseService;

   public GetCourseByCurriculumUC(CourseService courseService) {
      this.courseService = courseService;
   }

   public CourseDTO run(String curriculum) {
      
      return CourseAdapter.toDTO(courseService.getCourseByCurriculum(curriculum));
   }
}

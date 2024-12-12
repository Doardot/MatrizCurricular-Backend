package com.matrizcurricular.matriz.application.useCase;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.CourseDTO;
import com.matrizcurricular.matriz.domain.models.CourseModel;
import com.matrizcurricular.matriz.domain.service.CourseService;

@Component
public class GetCourseByCurriculumUC {
   private CourseService courseService;

   public GetCourseByCurriculumUC(CourseService courseService) {
      this.courseService = courseService;
   }

   public CourseDTO run(String curriculum) {
      CourseModel course = courseService.getCourseByCurriculum(curriculum);
      return new CourseDTO(course.getCurriculumCode(), course.getName(), course.getNumberSemesters(),
            course.getExtracurricularHours());
   }
}

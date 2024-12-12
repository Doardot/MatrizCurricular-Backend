package com.matrizcurricular.matriz.application.useCase;

import com.matrizcurricular.matriz.application.dto.CourseDTO;
import com.matrizcurricular.matriz.domain.service.CourseService;

public class GetCourseByCurriculumUC {
   private CourseService courseService;

   public GetCourseByCurriculumUC(CourseService courseService) {
      this.courseService = courseService;
   }

   public CourseDTO run(String curriculum) {
      // return new CourseDTO(course.getCurriculumCode(), course.getName(),
      // course.getNumberSemesters(),
      // course.getExtracurricularHours(), )
      return null;
   }
}

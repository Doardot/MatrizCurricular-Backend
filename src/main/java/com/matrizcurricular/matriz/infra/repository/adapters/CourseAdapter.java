package com.matrizcurricular.matriz.infra.repository.adapters;

import com.matrizcurricular.matriz.application.dto.CourseDTO;
import com.matrizcurricular.matriz.domain.models.CourseModel;
import com.matrizcurricular.matriz.infra.repository.entities.Course;

public class CourseAdapter {
   public static Course fromModel(CourseModel courseModel) {
      return new Course(courseModel.getCurriculumCode(), courseModel.getName(),
            courseModel.getNumberSemesters(),
            courseModel.getExtracurricularHours());
   }

   public static CourseModel toModel(Course course) {
      return new CourseModel(course.getCurriculumCode(), course.getName(),
      course.getNumberSemesters(),
      course.getExtracurricularHours());
   }

   public static CourseDTO toDTO(CourseModel course) {
      return new CourseDTO(course.getCurriculumCode(), course.getName(),
      course.getNumberSemesters(),
      course.getExtracurricularHours());
   }
}

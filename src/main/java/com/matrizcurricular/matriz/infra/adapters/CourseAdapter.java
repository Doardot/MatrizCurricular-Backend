package com.matrizcurricular.matriz.infra.adapters;

import java.util.List;

import com.matrizcurricular.matriz.application.dto.response.CourseDTO;
import com.matrizcurricular.matriz.domain.models.CourseModel;
import com.matrizcurricular.matriz.infra.database.entities.Course;

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

   public static List<CourseModel> listToModel(List<Course> courses) {
      return courses.stream().map(CourseAdapter::toModel).toList();
   }

   public static CourseDTO toDTO(CourseModel course) {
      return new CourseDTO(course.getCurriculumCode(), course.getName(),
      course.getNumberSemesters(),
      course.getExtracurricularHours());
   }

   public static List<CourseDTO> listToDTO(List<CourseModel> courses) {
      return courses.stream().map(CourseAdapter::toDTO).toList();
   }
}

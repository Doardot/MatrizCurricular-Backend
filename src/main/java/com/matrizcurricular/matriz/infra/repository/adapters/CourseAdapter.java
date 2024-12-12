package com.matrizcurricular.matriz.infra.repository.adapters;

import com.matrizcurricular.matriz.domain.models.CourseModel;
import com.matrizcurricular.matriz.infra.repository.entities.Course;

public class CourseAdapter {
   public static Course fromModel(CourseModel courseModel) {
      return null;
      // return new Course(courseModel.getCurriculumCode(), courseModel.getName(),
      // courseModel.getNumberSemesters(),
      // courseModel.getExtracurricularHours(),
      // CourseSubjectAdapter.fromModel(courseModel.getCourseSubjects()));
      // }
   }

   public static CourseModel toModel(Course course) {
      return null;
      // return new CourseModel(course.getCurriculumCode(), course.getName(),
      // course.getNumberSemesters(),
      // course.getExtracurricularHours(),
      // CourseSubjectAdapter.toModel(course.getCourseSubjects()));
   }
}



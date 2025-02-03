package com.matrizcurricular.matriz.application.useCase;

import java.util.List;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.response.CourseDTO;
import com.matrizcurricular.matriz.domain.service.CourseService;
import com.matrizcurricular.matriz.infra.adapters.CourseAdapter;

@Component
public class GetAllCoursesUC {
   private CourseService courseService;

   public GetAllCoursesUC(CourseService courseService) {
      this.courseService = courseService;
   }

   public List<CourseDTO> run() {
      return CourseAdapter.listToDTO(courseService.getAllCourses());
   }
}

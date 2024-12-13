package com.matrizcurricular.matriz.infra.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.application.dto.response.CourseSubjectDTO;
import com.matrizcurricular.matriz.application.useCase.GetCourseSubByCourseUC;

@RestController
@RequestMapping("/course-subject")
public class CourseSubjectController {
   private GetCourseSubByCourseUC getCourseSubByCourseUC;

   public CourseSubjectController(GetCourseSubByCourseUC getCourseSubByCourseUC) {
      this.getCourseSubByCourseUC = getCourseSubByCourseUC;
   }

   @GetMapping("/{curriculumCode}")
   @CrossOrigin("*")
   public List<CourseSubjectDTO> getCourseSubjectByCourse(@PathVariable String curriculumCode) {
      return getCourseSubByCourseUC.run(curriculumCode);
   }
}

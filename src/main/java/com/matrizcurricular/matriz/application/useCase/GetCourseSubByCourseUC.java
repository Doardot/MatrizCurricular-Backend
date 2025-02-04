package com.matrizcurricular.matriz.application.useCase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.response.CourseSubjectDTO;
import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;
import com.matrizcurricular.matriz.domain.models.RequirementsModel;
import com.matrizcurricular.matriz.domain.service.CourseSubjectService;
import com.matrizcurricular.matriz.domain.service.RequirementService;
import com.matrizcurricular.matriz.infra.adapters.CourseSubjectAdapter;

@Component
public class GetCourseSubByCourseUC {
   private CourseSubjectService courseService;
   private RequirementService requirementService;

   public GetCourseSubByCourseUC(CourseSubjectService courseService, RequirementService requirementService) {
      this.courseService = courseService;
      this.requirementService = requirementService;
   }

   public List<CourseSubjectDTO> run(String curriculumCode) {
     

      List<CourseSubjectModel> courseSubjectModel = courseService.getCourseSubjectByCourse(curriculumCode);
      List<CourseSubjectDTO> courseSubjectDTOs = new ArrayList<>();

      courseSubjectModel.forEach(courseSubject -> {
         List<RequirementsModel> requirements = requirementService.getRequirementsByCourseSubject(curriculumCode, courseSubject.getSubject().getCreditCode());
         List<RequirementsModel> inverseRequirements = requirementService.getInverseRequirementsByCourseSubject(curriculumCode, courseSubject.getSubject().getCreditCode());

         CourseSubjectDTO courseSubjectDTO = CourseSubjectAdapter.toDTO(courseSubject, requirements, inverseRequirements);
         courseSubjectDTOs.add(courseSubjectDTO);
      });

      return courseSubjectDTOs;
   }
}

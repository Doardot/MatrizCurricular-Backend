package com.matrizcurricular.matriz.infra.adapters;

import java.util.List;

import com.matrizcurricular.matriz.application.dto.response.CourseSubjectDTO;
import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;
import com.matrizcurricular.matriz.infra.repository.entities.CourseSubject;

public class CourseSubjectAdapter {
   public static CourseSubject fromModel(CourseSubjectModel courseSubjectModel) {
      CourseSubject courseSubject = new CourseSubject(CourseAdapter.fromModel(courseSubjectModel.getCourse()),
            SubjectAdapter.fromModel(courseSubjectModel.getSubject()),
            courseSubjectModel.getSemester(), courseSubjectModel.getRequirements().stream()
                  .map(RequirementsAdapter::fromModel).toList());
      if (courseSubjectModel.getPositionRequirement() != null) {
         courseSubject.setPositionRequirement(courseSubjectModel.getPositionRequirement());
      }
      return courseSubject;
   }

   public static List<CourseSubject> listFromModel(List<CourseSubjectModel> courseSubjectModels) {
      return courseSubjectModels.stream().map(cs -> fromModel(cs)).toList();
   }

   public static CourseSubjectModel toModel(CourseSubject courseSubject) {
      CourseSubjectModel courseSubjectModel = new CourseSubjectModel(CourseAdapter.toModel(courseSubject.getCourse()),
            SubjectAdapter.toModel(courseSubject.getSubject()), courseSubject.getSemester(),
            courseSubject.getRequirements().stream().map(RequirementsAdapter::toModel).toList());
      if (courseSubject.getPositionRequirement() != null) {
         courseSubjectModel.setPositionRequirement(courseSubject.getPositionRequirement());
      }
      return courseSubjectModel;
   }

   public static List<CourseSubjectModel> listToModel(List<CourseSubject> courseSubjects) {
      return courseSubjects.stream().map(cs -> toModel(cs)).toList();
   }

   public static CourseSubjectDTO toDTO(CourseSubjectModel courseSubject) {
      CourseSubjectDTO courseSubjectDTO = new CourseSubjectDTO(CourseAdapter.toDTO(courseSubject.getCourse()),
            SubjectAdapter.toDTO(courseSubject.getSubject()), courseSubject.getSemester(),
            RequirementsAdapter.listToDTO(courseSubject.getRequirements()));
      if (courseSubject.getPositionRequirement() != null) {
         courseSubjectDTO.setPositionRequirement(courseSubject.getPositionRequirement());
      }
      return courseSubjectDTO;
   }

   public static List<CourseSubjectDTO> listToDTO(List<CourseSubjectModel> courseSubjects) {
      return courseSubjects.stream().map(cs -> toDTO(cs)).toList();
   }
}

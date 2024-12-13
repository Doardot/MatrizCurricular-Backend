package com.matrizcurricular.matriz.infra.repository.adapters;

import com.matrizcurricular.matriz.application.dto.response.CourseSubjectDTO;
import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;
import com.matrizcurricular.matriz.infra.repository.entities.CourseSubject;

public class CourseSubjectAdapter {
   public static CourseSubject fromModel(CourseSubjectModel courseSubjectModel) {
      return new CourseSubject(CourseAdapter.fromModel(courseSubjectModel.getCourse()),
            SubjectAdapter.fromModel(courseSubjectModel.getSubject()),
            courseSubjectModel.getSemester(), courseSubjectModel.getRequirements().stream()
                  .map(RequirementsAdapter::fromModel).toList());
   }

   public static CourseSubjectModel toModel(CourseSubject courseSubject) {
      return new CourseSubjectModel(CourseAdapter.toModel(courseSubject.getCourse()),
            SubjectAdapter.toModel(courseSubject.getSubject()), courseSubject.getSemester(),
            courseSubject.getRequirements().stream().map(RequirementsAdapter::toModel).toList());
   }

   public static CourseSubjectDTO toDTO(CourseSubjectModel courseSubject) {
      return new CourseSubjectDTO(CourseAdapter.toDTO(courseSubject.getCourse()),
            SubjectAdapter.toDTO(courseSubject.getSubject()), courseSubject.getSemester(),
            RequirementsAdapter.listToDTO(courseSubject.getRequirements()));
   }
}

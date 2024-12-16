package com.matrizcurricular.matriz.infra.adapters;

import com.matrizcurricular.matriz.application.dto.response.SubjectDTO;
import com.matrizcurricular.matriz.domain.models.SubjectModel;
import com.matrizcurricular.matriz.infra.repository.entities.Subject;

public class SubjectAdapter {
   public static Subject fromModel(SubjectModel subjectModel) {
      return new Subject(subjectModel.getName(), subjectModel.getCreditCode(),
            subjectModel.getCredits(), subjectModel.getDescription());
   }

   public static SubjectModel toModel(Subject subject) {
      return new SubjectModel(subject.getCreditCode(), subject.getName(),
            subject.getCredits(), subject.getDescription());
   }

   public static SubjectDTO toDTO(SubjectModel subject) {
      return new SubjectDTO(subject.getCreditCode(), subject.getName(),
            subject.getCredits(), subject.getDescription());
   }
}

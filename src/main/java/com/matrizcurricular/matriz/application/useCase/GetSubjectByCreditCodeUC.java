package com.matrizcurricular.matriz.application.useCase;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.SubjectDTO;
import com.matrizcurricular.matriz.domain.models.SubjectModel;
import com.matrizcurricular.matriz.domain.service.SubjectService;

@Component
public class GetSubjectByCreditCodeUC {
   private SubjectService subjectService;

   public GetSubjectByCreditCodeUC(SubjectService subjectService) {
      this.subjectService = subjectService;
   }

   public SubjectDTO run(String creditCode) {
      SubjectModel subject = subjectService.getSubjectByCreditCode(creditCode);
      return new SubjectDTO(subject.getCreditCode(), subject.getName(), subject.getCredits(), subject.getDescription());
   }
}

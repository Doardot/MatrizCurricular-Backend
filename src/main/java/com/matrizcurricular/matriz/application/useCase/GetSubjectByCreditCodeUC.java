package com.matrizcurricular.matriz.application.useCase;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.response.SubjectDTO;
import com.matrizcurricular.matriz.domain.service.SubjectService;
import com.matrizcurricular.matriz.infra.repository.adapters.SubjectAdapter;

@Component
public class GetSubjectByCreditCodeUC {
   private SubjectService subjectService;

   public GetSubjectByCreditCodeUC(SubjectService subjectService) {
      this.subjectService = subjectService;
   }

   public SubjectDTO run(String creditCode) {
      return SubjectAdapter.toDTO(subjectService.getSubjectByCreditCode(creditCode));
   }
}

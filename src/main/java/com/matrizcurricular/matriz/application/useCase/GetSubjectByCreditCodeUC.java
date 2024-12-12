package com.matrizcurricular.matriz.application.useCase;

import com.matrizcurricular.matriz.application.dto.SubjectDTO;
import com.matrizcurricular.matriz.domain.service.SubjectService;

public class GetSubjectByCreditCodeUC {
   private SubjectService subjectService;

   public GetSubjectByCreditCodeUC(SubjectService subjectService) {
      this.subjectService = subjectService;
   }

   public SubjectDTO run(String creditCode) {
      //return subjectService.getSubjectByCreditCode(creditCode);
      return null;
   }
}

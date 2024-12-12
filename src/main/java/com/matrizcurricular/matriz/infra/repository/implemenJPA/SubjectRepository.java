package com.matrizcurricular.matriz.infra.repository.implemenJPA;

import com.matrizcurricular.matriz.domain.interfaceRepository.ISubjectRepository;
import com.matrizcurricular.matriz.domain.models.SubjectModel;
import com.matrizcurricular.matriz.infra.repository.interfaceJPA.SubjectJPA;

public class SubjectRepository implements ISubjectRepository {
   private SubjectJPA subjectRepository;

   public SubjectRepository(SubjectJPA subjectRepository) {
      this.subjectRepository = subjectRepository;
   }

   @Override
   public SubjectModel getSubjectByCreditCode(String creditCode) {
      // return SubjectAdapter.toModel(subjectRepository.findById(creditCode).get());
      return null;
   }
}

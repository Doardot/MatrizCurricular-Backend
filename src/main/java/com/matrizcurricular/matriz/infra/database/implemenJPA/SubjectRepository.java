package com.matrizcurricular.matriz.infra.database.implemenJPA;

import org.springframework.stereotype.Repository;

import com.matrizcurricular.matriz.domain.interfaceRepository.ISubjectRepository;
import com.matrizcurricular.matriz.domain.models.SubjectModel;
import com.matrizcurricular.matriz.infra.adapters.SubjectAdapter;
import com.matrizcurricular.matriz.infra.database.interfaceJPA.SubjectJPA;

@Repository
public class SubjectRepository implements ISubjectRepository {
   private SubjectJPA subjectRepository;

   public SubjectRepository(SubjectJPA subjectRepository) {
      this.subjectRepository = subjectRepository;
   }

   @Override
   public SubjectModel getSubjectByCreditCode(String creditCode) {
      return SubjectAdapter.toModel(subjectRepository.findById(creditCode).get());
   }
}

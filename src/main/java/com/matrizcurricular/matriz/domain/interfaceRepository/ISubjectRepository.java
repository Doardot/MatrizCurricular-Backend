package com.matrizcurricular.matriz.domain.interfaceRepository;

import com.matrizcurricular.matriz.domain.models.SubjectModel;

public interface ISubjectRepository {
   SubjectModel getSubjectByCreditCode(String creditCode);
}

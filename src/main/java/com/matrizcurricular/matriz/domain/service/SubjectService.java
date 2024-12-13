package com.matrizcurricular.matriz.domain.service;

import org.springframework.stereotype.Service;

import com.matrizcurricular.matriz.domain.interfaceRepository.ISubjectRepository;
import com.matrizcurricular.matriz.domain.models.SubjectModel;

@Service
public class SubjectService {
    private ISubjectRepository repository;

    public SubjectService(ISubjectRepository subjectRepository) {
        this.repository = subjectRepository;
    }

    public SubjectModel getSubjectByCreditCode(String creditCode) {
        return repository.getSubjectByCreditCode(creditCode);
    }
}

package com.matrizcurricular.matriz.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrizcurricular.matriz.domain.interfaceRepository.IRequirementRepository;
import com.matrizcurricular.matriz.domain.models.RequirementsModel;

@Service
public class RequirementService {
    private IRequirementRepository repository;

    public RequirementService(IRequirementRepository iRequirementRepository){
        this.repository = iRequirementRepository;
    }

    public List<RequirementsModel> getRequirementsByCourseSubject(String curriculumCode, String creditCode){
        return repository.getRequirementsByCourseSubject(curriculumCode, creditCode);
    }
}

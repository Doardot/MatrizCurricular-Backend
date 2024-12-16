package com.matrizcurricular.matriz.infra.database.implemenJPA;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.matrizcurricular.matriz.domain.interfaceRepository.IRequirementRepository;
import com.matrizcurricular.matriz.domain.models.RequirementsModel;
import com.matrizcurricular.matriz.infra.adapters.RequirementsAdapter;
import com.matrizcurricular.matriz.infra.database.interfaceJPA.RequirementJPA;

@Repository
public class RequirementsRepository implements IRequirementRepository {
    private RequirementJPA requirementsRepository;

    public RequirementsRepository(RequirementJPA requirementsRepository){
        this.requirementsRepository = requirementsRepository;
    }


    @Override
    public List<RequirementsModel> getRequirementsByCourseSubject(String curriculumCode, String creditCode) {
        return RequirementsAdapter.listToModel(requirementsRepository.findAll().stream()
            .filter(req -> req.getCourseSubject().getCourse().getCurriculumCode().equals(curriculumCode))
            .filter(req -> req.getCourseSubject().getSubject().getCreditCode().equals(creditCode))
            .toList());
    }


    @Override
    public List<RequirementsModel> getInverseRequirementsByCourseSubject(String curriculumCode, String creditCode) {
        return RequirementsAdapter.listToModel(requirementsRepository.findAll().stream()
        .filter(req -> req.getPreRequirement().getCourse().getCurriculumCode().equals(curriculumCode))
        .filter(req -> req.getPreRequirement().getSubject().getCreditCode().equals(creditCode))
        .toList());
    }
    
    
}

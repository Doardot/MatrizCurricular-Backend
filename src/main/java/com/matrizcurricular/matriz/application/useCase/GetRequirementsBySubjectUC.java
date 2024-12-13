package com.matrizcurricular.matriz.application.useCase;

import java.util.List;

import org.springframework.stereotype.Component;

import com.matrizcurricular.matriz.application.dto.response.RequirementsDTO;
import com.matrizcurricular.matriz.domain.service.RequirementService;
import com.matrizcurricular.matriz.infra.repository.adapters.RequirementsAdapter;

@Component
public class GetRequirementsBySubjectUC {
    private RequirementService service;

    public GetRequirementsBySubjectUC(RequirementService service){
        this.service = service;
    }

    public List<RequirementsDTO> run(String curriculumCode, String creditCode){
        return RequirementsAdapter.listToDTO(service.getRequirementsByCourseSubject(curriculumCode, creditCode));
    }
}

package com.matrizcurricular.matriz.domain.interfaceRepository;

import java.util.List;

import com.matrizcurricular.matriz.domain.models.RequirementsModel;

public interface IRequirementRepository {
    List<RequirementsModel> getRequirementsByCourseSubject(String curriculumCode, String creditCode);
    List<RequirementsModel> getInverseRequirementsByCourseSubject(String curriculumCode, String creditCode);
}

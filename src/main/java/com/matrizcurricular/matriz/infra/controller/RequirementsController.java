package com.matrizcurricular.matriz.infra.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.application.dto.request.RequestRequirementDTO;
import com.matrizcurricular.matriz.application.dto.response.RequirementsDTO;
import com.matrizcurricular.matriz.application.useCase.GetInverseRequirementsBySubjectUC;
import com.matrizcurricular.matriz.application.useCase.GetRequirementsBySubjectUC;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/requirement")
public class RequirementsController {
    private GetRequirementsBySubjectUC getRequirementsBySubjectUC;
    private GetInverseRequirementsBySubjectUC getInverseRequirementsBySubjectUC;

    public RequirementsController(GetRequirementsBySubjectUC getRequirementsBySubjectUC, GetInverseRequirementsBySubjectUC getInverseRequirementsBySubjectUC){
        this.getRequirementsBySubjectUC = getRequirementsBySubjectUC;
        this.getInverseRequirementsBySubjectUC = getInverseRequirementsBySubjectUC;
    }

    @GetMapping("/GetRequirementsBySubjectUC/")
    @CrossOrigin("*")
    public ResponseEntity<List<RequirementsDTO>> getRequirementsBySubject(@RequestBody RequestRequirementDTO requirementsDTO){
        return ResponseEntity.ok().body(getRequirementsBySubjectUC.run(requirementsDTO.getCurriculumCode(), requirementsDTO.getCreditCode()));
    }

    @GetMapping("/GetInverseRequirementsBySubjectUC/")
    @CrossOrigin("*")
    public ResponseEntity<List<RequirementsDTO>> getInverseRequirementsBySubject(@RequestBody RequestRequirementDTO requirementsDTO){
        return ResponseEntity.ok().body(getInverseRequirementsBySubjectUC.run(requirementsDTO.getCurriculumCode(), requirementsDTO.getCreditCode()));
    }
}

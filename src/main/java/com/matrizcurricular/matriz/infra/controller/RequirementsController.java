package com.matrizcurricular.matriz.infra.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.application.dto.request.RequestRequirementDTO;
import com.matrizcurricular.matriz.application.dto.response.RequirementsDTO;
import com.matrizcurricular.matriz.application.useCase.GetRequirementsBySubjectUC;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/requirement")
public class RequirementsController {
    private GetRequirementsBySubjectUC getRequirementsBySubjectUC;

    public RequirementsController(GetRequirementsBySubjectUC getRequirementsBySubjectUC){
        this.getRequirementsBySubjectUC = getRequirementsBySubjectUC;
    }

    @GetMapping
    @CrossOrigin("*")
    public ResponseEntity<List<RequirementsDTO>> getRequirementsBySubject(@RequestBody RequestRequirementDTO requirementsDTO){
        return ResponseEntity.ok().body(getRequirementsBySubjectUC.run(requirementsDTO.getCurriculumCode(), requirementsDTO.getCreditCode()));
    }
}

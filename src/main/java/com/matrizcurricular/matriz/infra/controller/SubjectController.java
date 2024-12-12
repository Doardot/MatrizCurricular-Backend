package com.matrizcurricular.matriz.infra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.application.dto.SubjectDTO;
import com.matrizcurricular.matriz.application.useCase.GetSubjectByCreditCodeUC;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private GetSubjectByCreditCodeUC getSubjectByCreditCodeUC;

    @Autowired
    public SubjectController(GetSubjectByCreditCodeUC getSubjectByCreditCodeUC) {
        this.getSubjectByCreditCodeUC = getSubjectByCreditCodeUC;
    }

    @GetMapping("/{creditCode}")
    @CrossOrigin("*")
    public SubjectDTO getSubjectByCreditCode(@PathVariable String creditCode) {
        return getSubjectByCreditCodeUC.run(creditCode);
    }
}

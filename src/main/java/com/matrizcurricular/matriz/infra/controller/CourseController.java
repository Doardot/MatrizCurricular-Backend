package com.matrizcurricular.matriz.infra.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.application.dto.response.CourseDTO;
import com.matrizcurricular.matriz.application.useCase.GetCourseByCurriculumUC;

@RestController
@RequestMapping("/course")
public class CourseController {
    private GetCourseByCurriculumUC getCourseByCurriculumUC;

    public CourseController(GetCourseByCurriculumUC getCourseByCurriculumUC) {
        this.getCourseByCurriculumUC = getCourseByCurriculumUC;
    }

    @GetMapping("/{curriculumCode}")
    @CrossOrigin("*")
    public CourseDTO getCourseById(@PathVariable String curriculumCode) {
        return getCourseByCurriculumUC.run(curriculumCode);
    }
}

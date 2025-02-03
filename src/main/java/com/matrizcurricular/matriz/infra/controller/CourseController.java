package com.matrizcurricular.matriz.infra.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.application.dto.response.CourseDTO;
import com.matrizcurricular.matriz.application.useCase.GetCourseByCurriculumUC;
import com.matrizcurricular.matriz.application.useCase.GetAllCoursesUC;

@RestController
@RequestMapping("/course")
public class CourseController {
    private GetCourseByCurriculumUC getCourseByCurriculumUC;
    private GetAllCoursesUC getAllCoursesUC;

    public CourseController(GetCourseByCurriculumUC getCourseByCurriculumUC, GetAllCoursesUC getAllCoursesUC) {
        this.getCourseByCurriculumUC = getCourseByCurriculumUC;
        this.getAllCoursesUC = getAllCoursesUC;
    }

    @GetMapping("/{curriculumCode}")
    @CrossOrigin("*")
    public CourseDTO getCourseById(@PathVariable String curriculumCode) {
        return getCourseByCurriculumUC.run(curriculumCode);
    }

    @GetMapping("/getAll")
    @CrossOrigin("*")
    public List<CourseDTO> getAllCourses() {
        return getAllCoursesUC.run();
    }
}

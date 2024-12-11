package com.matrizcurricular.matriz.infra.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.domain.service.CourseService;
import com.matrizcurricular.matriz.infra.repository.entities.Course;

@RestController
@RequestMapping("/course")
public class CourseController {
    private CourseService service;

    public CourseController(CourseService courseService){
        this.service = courseService;
    }

    @GetMapping()
    public ResponseEntity<List<Course>>findAll(){
        List<Course> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}

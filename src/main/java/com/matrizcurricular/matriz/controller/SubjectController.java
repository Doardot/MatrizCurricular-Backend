package com.matrizcurricular.matriz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrizcurricular.matriz.entity.Subject;
import com.matrizcurricular.matriz.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService service;

    @GetMapping
    public ResponseEntity<List<Subject>> findAll() {
        List<Subject> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
}

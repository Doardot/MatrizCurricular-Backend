package com.matrizcurricular.matriz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "course")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "curriculum_code", nullable = false)
    private String curriculumCode;

    @Column(name = "number_semesters", nullable = false)
    private int numberSemesters;

    //private List<Disciplina> disciplinas;
    //private List<Requisito> requisitos;
}

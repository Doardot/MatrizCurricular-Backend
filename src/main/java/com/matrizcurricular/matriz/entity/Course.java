package com.matrizcurricular.matriz.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "course")
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}

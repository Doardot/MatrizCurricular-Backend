package com.matrizcurricular.matriz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "credit_code", nullable = false)
    private String creditCode;

    @Column(name = "credits", nullable = false)
    private int credits;

    @Column(name = "approved", nullable = false)
    private Boolean approved;
}

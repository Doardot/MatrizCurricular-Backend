package com.matrizcurricular.matriz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cod_cred", nullable = false)
    private String codCred;

    @Column(name = "credits", nullable = false)
    private int credits;

    @Column(name = "completed", nullable = false)
    private Boolean completed;
}

package com.matrizcurricular.matriz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "credit_code", nullable = false, length = 6)
    private String creditCode;

    @Column(name = "credits", nullable = false)
    private int credits;

    @Column(name = "approved", nullable = false)
    private Boolean approved;
}

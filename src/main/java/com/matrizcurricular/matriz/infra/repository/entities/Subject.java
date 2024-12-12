package com.matrizcurricular.matriz.infra.repository.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @Column(name = "credit_code", nullable = false, length = 6)
    private String creditCode;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "credits", nullable = false)
    private int credits;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "id.subject")
    private Set<CourseSubject> courseSubjects;

    public Subject() {
    }

    public Subject(String name, String creditCode, int credits, String description, Set<CourseSubject> courseSubjects) {
        this.name = name;
        this.creditCode = creditCode;
        this.credits = credits;
        this.description = description;
        this.courseSubjects = courseSubjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

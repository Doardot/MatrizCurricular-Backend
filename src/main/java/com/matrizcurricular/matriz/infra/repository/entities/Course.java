package com.matrizcurricular.matriz.infra.repository.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "curriculum_code", nullable = false, length = 8)
    private String curriculumCode;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "number_semesters", nullable = false)
    private int numberSemesters;

    @Column(name = "extracurricular_hours", nullable = false)
    private int extracurricularHours;

    @OneToMany(mappedBy = "id.course", cascade = CascadeType.ALL)
    private Set<CourseSubject> courseSubjects;

    public Course() {
    }

    public Course(String name, String curriculumCode, int numberSemesters, int extracurricularHours) {
        this.name = name;
        this.curriculumCode = curriculumCode;
        this.numberSemesters = numberSemesters;
        this.extracurricularHours = extracurricularHours;
        this.courseSubjects = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurriculumCode() {
        return curriculumCode;
    }

    public void setCurriculumCode(String curriculumCode) {
        this.curriculumCode = curriculumCode;
    }

    public int getNumberSemesters() {
        return numberSemesters;
    }

    public void setNumberSemesters(int numberSemesters) {
        this.numberSemesters = numberSemesters;
    }

    public int getExtracurricularHours() {
        return extracurricularHours;
    }

    public void setExtracurricularHours(int extracurricularHours) {
        this.extracurricularHours = extracurricularHours;
    }

    public Set<CourseSubject> getCourseSubjects() {
        return courseSubjects;
    }

    public void setCourseSubjects(Set<CourseSubject> courseSubjects) {
        this.courseSubjects = courseSubjects;
    }
}

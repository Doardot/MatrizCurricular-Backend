package com.matrizcurricular.matriz.application.dto;

public class CourseDTO {

    private Long id;
    private String name;
    private String curriculumCode;
    private int numberSemesters;

    public CourseDTO(String name, String curriculumCode, int numberSemesters) {
        this.name = name;
        this.curriculumCode = curriculumCode;
        this.numberSemesters = numberSemesters;
    }

    public CourseDTO(Long id, String name, String curriculumCode, int numberSemesters) {
        this.id = id;
        this.name = name;
        this.curriculumCode = curriculumCode;
        this.numberSemesters = numberSemesters;
    }

    public CourseDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
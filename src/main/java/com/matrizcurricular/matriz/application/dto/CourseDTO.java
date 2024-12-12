package com.matrizcurricular.matriz.application.dto;
public class CourseDTO {

    private String curriculumCode;
    private String name;
    private int numberSemesters;
    private int extracurricularHours;

    public CourseDTO(String curriculumCode, String name, int numberSemesters, int extracurricularHours) {
        this.curriculumCode = curriculumCode;
        this.name = name;
        this.numberSemesters = numberSemesters;
        this.extracurricularHours = extracurricularHours;
    }

    public String getCurriculumCode() {
        return curriculumCode;
    }

    public String getName() {
        return name;
    }

    public int getNumberSemesters() {
        return numberSemesters;
    }

    public int getExtracurricularHours() {
        return extracurricularHours;
    }

    public String toString() {
        return "CourseDTO - curriculumCode = " + curriculumCode + ", name = " + name + ", numberSemesters = "
                + numberSemesters + ", extracurricularHours = " + extracurricularHours;
    }
}
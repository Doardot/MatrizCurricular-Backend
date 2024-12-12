package com.matrizcurricular.matriz.application.dto;

import java.util.Set;

public class CourseDTO {

    private String curriculumCode;
    private String name;
    private int numberSemesters;
    private int extracurricularHours;
    private Set<CourseSubjectDTO> courseSubjects;

    public CourseDTO(String curriculumCode, String name, int numberSemesters, int extracurricularHours,
            Set<CourseSubjectDTO> courseSubjects) {
        this.curriculumCode = curriculumCode;
        this.name = name;
        this.numberSemesters = numberSemesters;
        this.extracurricularHours = extracurricularHours;
        this.courseSubjects = courseSubjects;
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

    public Set<CourseSubjectDTO> getCourseSubjects() {
        return courseSubjects;
    }

    public String toString() {
        return "CourseDTO - curriculumCode = " + curriculumCode + ", name = " + name + ", numberSemesters = "
                + numberSemesters + ", extracurricularHours = " + extracurricularHours + ", courseSubjects = "
                + courseSubjects.toString();
    }
}
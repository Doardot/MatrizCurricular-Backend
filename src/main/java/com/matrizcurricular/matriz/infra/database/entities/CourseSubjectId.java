package com.matrizcurricular.matriz.infra.database.entities;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CourseSubjectId implements Serializable {

    @Column(name = "course_id")
    private String courseId; // Alterado para String

    @Column(name = "subject_id")
    private String subjectId; // Alterado para String

    // Construtores, getters, setters, equals e hashCode
    public CourseSubjectId() {}

    public CourseSubjectId(String courseId, String subjectId) {
        this.courseId = courseId;
        this.subjectId = subjectId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseSubjectId that = (CourseSubjectId) o;

        if (!courseId.equals(that.courseId)) return false;
        return subjectId.equals(that.subjectId);
    }

    @Override
    public int hashCode() {
        int result = courseId.hashCode();
        result = 31 * result + subjectId.hashCode();
        return result;
    }
}
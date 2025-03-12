package com.matrizcurricular.matriz.infra.database.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_subject")
public class CourseSubject {

   @EmbeddedId
   private CourseSubjectId id;

   @ManyToOne(fetch = FetchType.LAZY)
   @MapsId("courseId") // Referencia o campo da chave composta
   @JoinColumn(name = "course_id", referencedColumnName = "curriculum_code", nullable = false)
   private Course course;

   @ManyToOne(fetch = FetchType.LAZY)
   @MapsId("subjectId") // Referencia o campo da chave composta
   @JoinColumn(name = "subject_id", referencedColumnName = "credit_code", nullable = false)
   private Subject subject;

   @Column(name = "semester", nullable = false)
   private int semester;

   @OneToMany(mappedBy = "courseSubject")
   private List<Requirements> requirements;

   @Column(name = "position_requirement", nullable = true)
   private Integer positionRequirement;

   // Construtores, getters e setters
   public CourseSubject() {}

   public CourseSubject(Course course, Subject subject, int semester, List<Requirements> requirements) {
       this.id = new CourseSubjectId(course.getCurriculumCode(), subject.getCreditCode());
       this.course = course;
       this.subject = subject;
       this.semester = semester;
       this.requirements = requirements;
   }

    public CourseSubjectId getId() {
        return id;
    }

    public void setId(CourseSubjectId id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<Requirements> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirements> requirements) {
        this.requirements = requirements;
    }

    public Integer getPositionRequirement() {
        return positionRequirement;
    }

    public void setPositionRequirement(Integer positionRequirement) {
        this.positionRequirement = positionRequirement;
    }
}

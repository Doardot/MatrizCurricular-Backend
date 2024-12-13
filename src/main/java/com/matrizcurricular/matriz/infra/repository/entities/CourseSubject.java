package com.matrizcurricular.matriz.infra.repository.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_subject")
public class CourseSubject {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private long id;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "course_id", referencedColumnName = "curriculum_code", nullable = false)
   private Course course;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "subject_id", referencedColumnName = "credit_code", nullable = false)
   private Subject subject;

   @Column(name = "semester", nullable = false)
   private int semester;

   @OneToMany(mappedBy = "courseSubject")
   private List<Requirements> requirements;

   public CourseSubject() {
   }

   public CourseSubject(Course course, Subject subject, int semester, List<Requirements> requirements) {
      this.course = course;
      this.subject = subject;
      this.semester = semester;
      this.requirements = requirements;
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
}

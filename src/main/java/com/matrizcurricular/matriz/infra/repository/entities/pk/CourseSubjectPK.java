package com.matrizcurricular.matriz.infra.repository.entities.pk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matrizcurricular.matriz.infra.repository.entities.Course;
import com.matrizcurricular.matriz.infra.repository.entities.Subject;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CourseSubjectPK {

   @ManyToOne
   @JoinColumn(name = "course_id", referencedColumnName = "curriculum_code", nullable = false)
   private Course course;

   @ManyToOne
   @JoinColumn(name = "subject_id", referencedColumnName = "credit_code", nullable = false)
   private Subject subject;

   @JsonIgnore
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
}

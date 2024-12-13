package com.matrizcurricular.matriz.infra.repository.entities;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "requirements")
public class Requirements {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name = "requisite_type", nullable = false)
   private RequisiteType requisiteType;

   @ManyToOne
   @JoinColumn(name = "subject_id", referencedColumnName = "subject_id", nullable = false)
   private CourseSubject courseSubject;

   public Requirements() {
   }

   public Requirements(RequisiteType requisiteType, CourseSubject courseSubject) {
      this.requisiteType = requisiteType;
      this.courseSubject = courseSubject;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public RequisiteType getRequisiteType() {
      return requisiteType;
   }

   public void setRequisiteType(RequisiteType requisiteType) {
      this.requisiteType = requisiteType;
   }

   public CourseSubject getCourseSubject() {
      return courseSubject;
   }

   public void setCourseSubject(CourseSubject courseSubject) {
      this.courseSubject = courseSubject;
   }
}

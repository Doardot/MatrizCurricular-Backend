package com.matrizcurricular.matriz.infra.repository.entities;

import java.util.HashMap;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;
import com.matrizcurricular.matriz.infra.repository.entities.pk.CourseSubjectPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class CourseSubject {

   @EmbeddedId
   private CourseSubjectPK id;

   @Column(name = "semester", nullable = false)
   private int semester;

   private HashMap<Subject, RequisiteType> requisiteTypes;

   public CourseSubject() {
   }

   public CourseSubject(Course course, Subject subject) {
      this.id = new CourseSubjectPK();
      this.id.setCourse(course);
      this.id.setSubject(subject);
      this.requisiteTypes = new HashMap<>();
   }

   public CourseSubjectPK getId() {
      return id;
   }

   public void setId(CourseSubjectPK id) {
      this.id = id;
   }

   public int getSemester() {
      return semester;
   }

   public void setSemester(int semester) {
      this.semester = semester;
   }

   public HashMap<Subject, RequisiteType> getRequisiteTypes() {
      return requisiteTypes;
   }

   public void setRequisiteTypes(HashMap<Subject, RequisiteType> requisiteTypes) {
      this.requisiteTypes = requisiteTypes;
   }
}

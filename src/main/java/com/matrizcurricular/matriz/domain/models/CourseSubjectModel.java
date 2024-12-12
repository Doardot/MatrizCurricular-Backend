package com.matrizcurricular.matriz.domain.models;

import java.util.HashMap;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

public class CourseSubjectModel {
   private CourseModel course;
   private SubjectModel subject;
   private int semester;
   private HashMap<SubjectModel, RequisiteType> requisiteTypes;


   public CourseSubjectModel(CourseModel course, SubjectModel subject, int semester) {
      this.course = course;
      this.subject = subject;
      this.semester = semester;
      this.requisiteTypes = new HashMap<>();
   }

   public CourseModel getCourse() {
      return course;
   }

   public void setCourse(CourseModel course) {
      this.course = course;
   }

   public SubjectModel getSubject() {
      return subject;
   }

   public void setSubject(SubjectModel subject) {
      this.subject = subject;
   }

   public int getSemester() {
      return semester;
   }

   public void setSemester(int semester) {
      this.semester = semester;
   }

   public HashMap<SubjectModel, RequisiteType> getRequisiteTypes() {
      return requisiteTypes;
   }

   public void setRequisiteTypes(HashMap<SubjectModel, RequisiteType> requisiteTypes) {
      this.requisiteTypes = requisiteTypes;
   }
}

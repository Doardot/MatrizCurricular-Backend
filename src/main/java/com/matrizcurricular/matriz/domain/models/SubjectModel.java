package com.matrizcurricular.matriz.domain.models;

import java.util.Set;

public class SubjectModel {
   private String creditCode;
   private String name;
   private int credits;
   private String description;
   private Set<CourseSubjectModel> courseSubjects;

   public SubjectModel(String creditCode, String name, int credits, String description,
         Set<CourseSubjectModel> courseSubjects) {
      this.creditCode = creditCode;
      this.name = name;
      this.credits = credits;
      this.description = description;
      this.courseSubjects = courseSubjects;
   }

   public String getCreditCode() {
      return creditCode;
   }

   public void setCreditCode(String creditCode) {
      this.creditCode = creditCode;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getCredits() {
      return credits;
   }

   public void setCredits(int credits) {
      this.credits = credits;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Set<CourseSubjectModel> getCourseSubjects() {
      return courseSubjects;
   }

   public void setCourseSubjects(Set<CourseSubjectModel> courseSubjects) {
      this.courseSubjects = courseSubjects;
   }
}

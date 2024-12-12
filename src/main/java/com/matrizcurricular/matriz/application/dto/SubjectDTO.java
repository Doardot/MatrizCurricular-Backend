package com.matrizcurricular.matriz.application.dto;

import java.util.Set;

public class SubjectDTO {
   private String creditCode;
   private String name;
   private int credits;
   private String description;
   private Set<CourseSubjectDTO> courseSubjects;

   public SubjectDTO(String creditCode, String name, int credits, String description,
         Set<CourseSubjectDTO> courseSubjects) {
      this.creditCode = creditCode;
      this.name = name;
      this.credits = credits;
      this.description = description;
      this.courseSubjects = courseSubjects;
   }

   public String getCreditCode() {
      return creditCode;
   }

   public String getName() {
      return name;
   }

   public int getCredits() {
      return credits;
   }

   public String getDescription() {
      return description;
   }

   public Set<CourseSubjectDTO> getCourseSubjects() {
      return courseSubjects;
   }

   public String toString() {
      return "SubjectDTO - creditCode = " + creditCode + ", name = " + name + ", credits = " + credits
            + ", description = "
            + description + ", courseSubjects = " + courseSubjects;
   }
}

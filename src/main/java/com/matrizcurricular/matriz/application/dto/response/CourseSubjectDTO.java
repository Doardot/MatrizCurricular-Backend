package com.matrizcurricular.matriz.application.dto.response;

import java.util.List;

public class CourseSubjectDTO {
   private CourseDTO course;
   private SubjectDTO subject;
   private int semester;
   private List<RequirementsDTO> requirements;
   private Integer positionRequirement;

   public CourseSubjectDTO(CourseDTO course, SubjectDTO subject, int semester,
         List<RequirementsDTO> requirements) {
      this.course = course;
      this.subject = subject;
      this.semester = semester;
      this.requirements = requirements;
   }

   public CourseDTO getCourse() {
      return course;
   }

   public SubjectDTO getSubject() {
      return subject;
   }

   public int getSemester() {
      return semester;
   }

   public List<RequirementsDTO> getRequirements() {
      return requirements;
   }

   public Integer getPositionRequirement() {
      return positionRequirement;
   }

   public void setPositionRequirement(Integer positionRequirement) {
      this.positionRequirement = positionRequirement;
   }

   @Override
   public String toString() {
      return "CourseSubjectDTO - course = " + course + ", subject = " + subject + ", semester = "
            + semester + ", requirements = " + requirements;
   }
}

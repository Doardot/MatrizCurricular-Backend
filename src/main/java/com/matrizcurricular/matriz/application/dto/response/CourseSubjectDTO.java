package com.matrizcurricular.matriz.application.dto.response;

import java.util.List;

public class CourseSubjectDTO {
   private String courseId;
   private String subjectId;
   private int semester;
   private Integer positionRequirement;
   private List<RequirementsDTO> requirements;

   public CourseSubjectDTO(String courseId, String subjectId, int semester,
         List<RequirementsDTO> requirements) {
      this.courseId = courseId;
      this.subjectId = subjectId;
      this.semester = semester;
      this.requirements = requirements;
   }

   public String getCourse() {
      return courseId;
   }

   public String getSubject() {
      return subjectId;
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
}

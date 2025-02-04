package com.matrizcurricular.matriz.application.dto.response;

import java.util.List;

public class CourseSubjectDTO {
   private String creditCode;
   private String subjectName;
   private int numberSemester;
   private Integer positionRequirement;
   private List<RequirementsDTO> requirements;
   private List<RequirementsDTO> prerequired;
   private String description;

   public CourseSubjectDTO(String creditCode, String subjectName, int numberSemester, List<RequirementsDTO> requirements,
         List<RequirementsDTO> prerequired, String description) {
      this.creditCode = creditCode;
      this.subjectName = subjectName;
      this.numberSemester = numberSemester;
      this.requirements = requirements;
      this.prerequired = prerequired;
      this.description = description;
   }

   public String getCreditCode() {
      return creditCode;
   }

   public String getSubjectName() {
      return subjectName;
   }

   public int getNumberSemester() {
      return numberSemester;
   }

   public Integer getPositionRequirement() {
      return positionRequirement;
   }

   public List<RequirementsDTO> getRequirements() {
      return requirements;
   }

   public List<RequirementsDTO> getPrerequired() {
      return prerequired;
   }

   public String getDescription() {
      return description;
   }

   public void setPositionRequirement(Integer positionRequirement) {
      this.positionRequirement = positionRequirement;
   }   
}

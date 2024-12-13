package com.matrizcurricular.matriz.application.dto;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

public class RequirementsDTO {
   private long id;
   private RequisiteType requisiteType;
   private String courseSubjectCreditCode;
   private String courseSubjectCurriculumCode;
   private String preRequirementCreditCode;
   private String preRequirementCurriculumCode;

   public RequirementsDTO(long id, RequisiteType requisiteType, String courseSubjectCreditCode,
         String courseSubjectCurriculumCode, String preRequirementCreditCode, String preRequirementCurriculumCode) {
      this.id = id;
      this.requisiteType = requisiteType;
      this.courseSubjectCreditCode = courseSubjectCreditCode;
      this.courseSubjectCurriculumCode = courseSubjectCurriculumCode;
      this.preRequirementCreditCode = preRequirementCreditCode;
      this.preRequirementCurriculumCode = preRequirementCurriculumCode;
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

   public String getCourseSubjectCreditCode() {
      return courseSubjectCreditCode;
   }

   public String getCourseSubjectCurriculumCode() {
      return courseSubjectCurriculumCode;
   }

   public String getPreRequirementCreditCode() {
      return preRequirementCreditCode;
   }

   public String getPreRequirementCurriculumCode() {
      return preRequirementCurriculumCode;
   }

   public String toString() {
      return "RequirementsDTO - id = " + id + ", requisiteType = " + requisiteType;
   }
}

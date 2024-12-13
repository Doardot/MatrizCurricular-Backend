package com.matrizcurricular.matriz.domain.models;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

public class RequirementsModel {
   private long id;
   private RequisiteType requisiteType;
   private String courseSubjectCreditCode;
   private String courseSubjectCurriculumCode;
   private String preRequirementCreditCode;
   private String preRequirementCurriculumCode;

   public RequirementsModel(long id, RequisiteType requisiteType, String courseSubjectCreditCode,
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

   public void setCourseSubjectCreditCode(String courseSubjectCreditCode) {
      this.courseSubjectCreditCode = courseSubjectCreditCode;
   }

   public String getCourseSubjectCurriculumCode() {
      return courseSubjectCurriculumCode;
   }

   public void setCourseSubjectCurriculumCode(String courseSubjectCurriculumCode) {
      this.courseSubjectCurriculumCode = courseSubjectCurriculumCode;
   }

   public String getPreRequirementCreditCode() {
      return preRequirementCreditCode;
   }

   public void setPreRequirementCreditCode(String preRequirementCreditCode) {
      this.preRequirementCreditCode = preRequirementCreditCode;
   }

   public String getPreRequirementCurriculumCode() {
      return preRequirementCurriculumCode;
   }

   public void setPreRequirementCurriculumCode(String preRequirementCurriculumCode) {
      this.preRequirementCurriculumCode = preRequirementCurriculumCode;
   }

}

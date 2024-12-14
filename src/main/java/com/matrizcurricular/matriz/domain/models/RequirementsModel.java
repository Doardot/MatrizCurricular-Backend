package com.matrizcurricular.matriz.domain.models;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

public class RequirementsModel {
   private long id;
   private RequisiteType requisiteType;
   private String courseSubjectCreditCode;
   private String courseSubjectName;
   private String preRequirementCreditCode;
   private String preRequirementName;

   public RequirementsModel(long id, RequisiteType requisiteType, String courseSubjectCreditCode,
         String courseSubjectName, String preRequirementCreditCode, String preRequirementName) {
      this.id = id;
      this.requisiteType = requisiteType;
      this.courseSubjectCreditCode = courseSubjectCreditCode;
      this.courseSubjectName = courseSubjectName;
      this.preRequirementCreditCode = preRequirementCreditCode;
      this.preRequirementName = preRequirementName;
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

   public String getCourseSubjectName() {
      return courseSubjectName;
   }

   public void setCourseSubjectName(String courseSubjectName) {
      this.courseSubjectName = courseSubjectName;
   }

   public String getPreRequirementCreditCode() {
      return preRequirementCreditCode;
   }

   public void setPreRequirementCreditCode(String preRequirementCreditCode) {
      this.preRequirementCreditCode = preRequirementCreditCode;
   }

   public String getPreRequirementName() {
      return preRequirementName;
   }

   public void setPreRequirementName(String preRequirementName) {
      this.preRequirementName = preRequirementName;
   }

}

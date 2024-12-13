package com.matrizcurricular.matriz.application.dto;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

public class RequirementsDTO {
   private long id;
   private RequisiteType requisiteType;
   private String creditCode;
   private String curriculumCode;

   public RequirementsDTO(long id, RequisiteType requisiteType, String creditCode, String curriculumCode) {
      this.id = id;
      this.requisiteType = requisiteType;
      this.creditCode = creditCode;
      this.curriculumCode = curriculumCode;
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

   public String getCreditCode() {
      return creditCode;
   }

   public void setCreditCode(String creditCode) {
      this.creditCode = creditCode;
   }

   public String getCurriculumCode() {
      return curriculumCode;
   }

   public void setCurriculumCode(String curriculumCode) {
      this.curriculumCode = curriculumCode;
   }

   public String toString() {
      return "RequirementsDTO - id = " + id + ", requisiteType = " + requisiteType;
   }
}

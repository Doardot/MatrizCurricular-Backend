package com.matrizcurricular.matriz.application.dto;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

public class RequirementsDTO {
   private long id;
   private RequisiteType requisiteType;
   private SubjectDTO subject;

   public RequirementsDTO(long id, RequisiteType requisiteType, SubjectDTO subject) {
      this.id = id;
      this.requisiteType = requisiteType;
      this.subject = subject;
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

   public String toString() {
      return "RequirementsDTO - id = " + id + ", requisiteType = " + requisiteType + ", subject = " + subject;
   }
}

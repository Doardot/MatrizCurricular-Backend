package com.matrizcurricular.matriz.domain.models;

import com.matrizcurricular.matriz.domain.enums.RequisiteType;

public class RequirementsModel {
   private long id;
   private RequisiteType requisiteType;
   private SubjectModel subject;

   public RequirementsModel(long id, RequisiteType requisiteType, SubjectModel subject) {
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

   public void setRequisiteType(RequisiteType requisiteType) {
      this.requisiteType = requisiteType;
   }

   public SubjectModel getSubject() {
      return subject;
   }

   public void setSubject(SubjectModel subject) {
      this.subject = subject;
   }

}

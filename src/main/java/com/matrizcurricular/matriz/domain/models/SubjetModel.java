package com.matrizcurricular.matriz.domain.models;

public class SubjetModel {
   private String creditCode;
   private String name;
   private int credits;
   private String description;

   public SubjetModel(String creditCode, String name, int credits, String description) {
      this.creditCode = creditCode;
      this.name = name;
      this.credits = credits;
      this.description = description;
   }

   public String getCreditCode() {
      return creditCode;
   }

   public void setCreditCode(String creditCode) {
      this.creditCode = creditCode;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getCredits() {
      return credits;
   }

   public void setCredits(int credits) {
      this.credits = credits;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}

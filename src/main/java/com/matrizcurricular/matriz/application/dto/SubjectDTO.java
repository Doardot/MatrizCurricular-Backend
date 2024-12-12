package com.matrizcurricular.matriz.application.dto;

public class SubjectDTO {
   private String creditCode;
   private String name;
   private int credits;
   private String description;

   public SubjectDTO(String creditCode, String name, int credits, String description) {
      this.creditCode = creditCode;
      this.name = name;
      this.credits = credits;
      this.description = description;
   }

   public String getCreditCode() {
      return creditCode;
   }

   public String getName() {
      return name;
   }

   public int getCredits() {
      return credits;
   }

   public String getDescription() {
      return description;
   }

   public String toString() {
      return "SubjectDTO - creditCode = " + creditCode + ", name = " + name + ", credits = " + credits
            + ", description = "
            + description;
   }
}

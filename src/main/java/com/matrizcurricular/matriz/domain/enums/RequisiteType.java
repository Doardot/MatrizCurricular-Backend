package com.matrizcurricular.matriz.domain.enums;

public enum RequisiteType {
   PREREQUISITE(1),
   SPECIAL(2),
   COREQUISITE(3);

   private final int value;

   RequisiteType(int value) {
      this.value = value;
   }

   public int getValue() {
      return value;
   }

   public static RequisiteType valueOf(int value) {
      for (RequisiteType requisiteType : RequisiteType.values()) {
         if (requisiteType.getValue() == value) {
            return requisiteType;
         }
      }
      throw new IllegalArgumentException("Invalid RequisiteType value: " + value);
   }
}

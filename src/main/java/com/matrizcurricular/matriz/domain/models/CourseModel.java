package com.matrizcurricular.matriz.domain.models;

public class CourseModel {
   private String curriculumCode;
   private String name;
   private int numberSemesters;
   private int extracurricularHours;

   public CourseModel(String curriculumCode, String name, int numberSemesters, int extracurricularHours) {
      this.curriculumCode = curriculumCode;
      this.name = name;
      this.numberSemesters = numberSemesters;
      this.extracurricularHours = extracurricularHours;
   }

   public String getCurriculumCode() {
      return curriculumCode;
   }

   public void setCurriculumCode(String curriculumCode) {
      this.curriculumCode = curriculumCode;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getNumberSemesters() {
      return numberSemesters;
   }

   public void setNumberSemesters(int numberSemesters) {
      this.numberSemesters = numberSemesters;
   }

   public int getExtracurricularHours() {
      return extracurricularHours;
   }

   public void setExtracurricularHours(int extracurricularHours) {
      this.extracurricularHours = extracurricularHours;
   }
}

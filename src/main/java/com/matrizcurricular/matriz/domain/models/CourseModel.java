package com.matrizcurricular.matriz.domain.models;

import java.util.Set;

public class CourseModel {
   private String curriculumCode;
   private String name;
   private int numberSemesters;
   private int extracurricularHours;
   private Set<CourseSubjectModel> courseSubjects;

   public CourseModel(String curriculumCode, String name, int numberSemesters, int extracurricularHours,
         Set<CourseSubjectModel> courseSubjects) {
      this.curriculumCode = curriculumCode;
      this.name = name;
      this.numberSemesters = numberSemesters;
      this.extracurricularHours = extracurricularHours;
      this.courseSubjects = courseSubjects;
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

   public Set<CourseSubjectModel> getCourseSubjects() {
      return courseSubjects;
   }

   public void setCourseSubjects(Set<CourseSubjectModel> courseSubjects) {
      this.courseSubjects = courseSubjects;
   }
}

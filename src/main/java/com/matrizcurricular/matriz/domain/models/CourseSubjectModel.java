package com.matrizcurricular.matriz.domain.models;

import java.util.List;

public class CourseSubjectModel {
   private CourseModel course;
   private SubjectModel subject;
   private int semester;
   private List<RequirementsModel> requirements;

   public CourseSubjectModel(CourseModel course, SubjectModel subject, int semester, List<RequirementsModel> requirements) {
      this.course = course;
      this.subject = subject;
      this.semester = semester;
      this.requirements = requirements;
   }

   public CourseModel getCourse() {
      return course;
   }

   public void setCourse(CourseModel course) {
      this.course = course;
   }

   public SubjectModel getSubject() {
      return subject;
   }

   public void setSubject(SubjectModel subject) {
      this.subject = subject;
   }

   public int getSemester() {
      return semester;
   }

   public void setSemester(int semester) {
      this.semester = semester;
   }

   public List<RequirementsModel> getRequirements() {
      return requirements;
   }

   public void setRequirements(List<RequirementsModel> requirements) {
      this.requirements = requirements;
   }
}

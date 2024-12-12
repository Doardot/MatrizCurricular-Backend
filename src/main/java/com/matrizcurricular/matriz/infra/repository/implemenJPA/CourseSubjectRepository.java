package com.matrizcurricular.matriz.infra.repository.implemenJPA;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.matrizcurricular.matriz.domain.interfaceRepository.ICourseSubjectRepository;
import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;
import com.matrizcurricular.matriz.domain.models.RequirementsModel;
import com.matrizcurricular.matriz.infra.repository.adapters.CourseSubjectAdapter;
import com.matrizcurricular.matriz.infra.repository.adapters.RequirementsAdapter;
import com.matrizcurricular.matriz.infra.repository.interfaceJPA.CourseSubjectJPA;

@Repository
public class CourseSubjectRepository implements ICourseSubjectRepository {
   private CourseSubjectJPA courseSubjectRepository;

   public CourseSubjectRepository(CourseSubjectJPA courseSubjectRepository) {
      this.courseSubjectRepository = courseSubjectRepository;
   }

   @Override
   public List<CourseSubjectModel> getCourseSubjectByCourse(String curriculumCode) {
      return courseSubjectRepository.findAll().stream()
            .filter(cs -> cs.getCourse().getCurriculumCode().equals(curriculumCode))
            .map(cs -> CourseSubjectAdapter.toModel(cs)).toList();
   }

   @Override
   public List<RequirementsModel> getRequirementsByCourseSubject(String curriculumCode, String creditCode) {
      return RequirementsAdapter.listToModel(courseSubjectRepository.findAll().stream()
            .filter(cs -> cs.getCourse().getCurriculumCode().equals(curriculumCode))
            .filter(cs -> cs.getSubject().getCreditCode().equals(creditCode))
            .flatMap(cs -> cs.getRequirements().stream())
            .toList());
   }
}

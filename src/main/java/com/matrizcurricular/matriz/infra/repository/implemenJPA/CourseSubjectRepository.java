package com.matrizcurricular.matriz.infra.repository.implemenJPA;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.matrizcurricular.matriz.domain.interfaceRepository.ICourseSubjectRepository;
import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;
import com.matrizcurricular.matriz.infra.repository.adapters.CourseSubjectAdapter;
import com.matrizcurricular.matriz.infra.repository.interfaceJPA.CourseSubjectJPA;

@Repository
public class CourseSubjectRepository implements ICourseSubjectRepository {
   private CourseSubjectJPA courseSubjectRepository;

   public CourseSubjectRepository(CourseSubjectJPA courseSubjectRepository) {
      this.courseSubjectRepository = courseSubjectRepository;
   }

   @Override
   public List<CourseSubjectModel> getCourseSubjectByCourse(String curriculumCode) {
      return CourseSubjectAdapter.listToModel(courseSubjectRepository.findAll().stream()
            .filter(cs -> cs.getCourse().getCurriculumCode().equals(curriculumCode)).toList());
   }

}

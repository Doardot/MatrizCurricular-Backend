package com.matrizcurricular.matriz.infra.database.implemenJPA;

import org.springframework.stereotype.Repository;

import com.matrizcurricular.matriz.domain.interfaceRepository.ICourseRepository;
import com.matrizcurricular.matriz.domain.models.CourseModel;
import com.matrizcurricular.matriz.infra.adapters.CourseAdapter;
import com.matrizcurricular.matriz.infra.database.interfaceJPA.CourseJPA;

@Repository
public class CourseRepository implements ICourseRepository {
   private CourseJPA courseRepository;

   public CourseRepository(CourseJPA courseRepository) {
      this.courseRepository = courseRepository;
   }

   @Override
   public CourseModel getCourseByCurriculum(String curriculum) {
      return CourseAdapter.toModel(courseRepository.findById(curriculum).get());
   }
}

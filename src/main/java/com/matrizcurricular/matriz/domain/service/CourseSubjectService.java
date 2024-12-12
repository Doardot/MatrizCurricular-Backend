package com.matrizcurricular.matriz.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrizcurricular.matriz.domain.interfaceRepository.ICourseSubjectRepository;
import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;

@Service
public class CourseSubjectService {
   private ICourseSubjectRepository repository;

   public CourseSubjectService(ICourseSubjectRepository courseSubjectRepository) {
      this.repository = courseSubjectRepository;
   }

   public List<CourseSubjectModel> getCourseSubjectByCourse(String curriculumCode){
      return repository.getCourseSubjectByCourse(curriculumCode);
   }
}

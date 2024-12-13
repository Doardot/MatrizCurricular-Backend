package com.matrizcurricular.matriz.domain.interfaceRepository;

import java.util.List;

import com.matrizcurricular.matriz.domain.models.CourseSubjectModel;

public interface ICourseSubjectRepository {
   List<CourseSubjectModel> getCourseSubjectByCourse(String curriculumCode);
}
